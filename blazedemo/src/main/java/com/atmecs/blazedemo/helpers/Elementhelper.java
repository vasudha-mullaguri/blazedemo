package com.atmecs.blazedemo.helpers;

import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.blazedemo.constants.Constant;
import com.atmecs.blazedemo.utils.PropertyReader;

import junit.framework.Assert;

public class Elementhelper {
	
		//WebDriver driver;
	public void clickElement(WebDriver driver,String path,String element) {
		Properties page_path= PropertyReader.readProperties(path);
		String xpath=page_path.getProperty(element);
		driver.findElement(By.xpath(xpath)).click();
		
	}

	public void sendKeys(WebDriver driver,String path, String details_path,String element, String text) {
		Properties page_path= PropertyReader.readProperties(path);
		String xpath=page_path.getProperty(element);
		Properties properties= PropertyReader.readProperties(details_path);
		String data=properties.getProperty(text);
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}

	
	public void explicitWait(WebDriver driver,String path,String element) {
		Properties page_path= PropertyReader.readProperties(path);
		String xpath=page_path.getProperty(element);
		WebElement element1=driver.findElement(By.xpath(xpath));
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(element1));
     	element1.click();
	}
	public void selectFromDropdown(WebDriver driver,String path,String element,String valueToSelect)
	{
		Properties page_path= PropertyReader.readProperties(path);
		String xpath=page_path.getProperty(element);
		
	Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
	dropdown.selectByVisibleText(valueToSelect);
	}
	
	
	public void textvalidate(WebDriver driver,String path, String element, String expected) {
		Properties page_path= PropertyReader.readProperties(path);
		String xpath=page_path.getProperty(element);
		String actual = driver.findElement(By.xpath(xpath)).getText();
		
		try {
			Assert.assertEquals(actual, expected);
			System.out.println("assertion passed:" + actual);
		} catch (AssertionError e) {
			System.out.println("Assertion failed" + e.getMessage());
		}
	}

	
}


