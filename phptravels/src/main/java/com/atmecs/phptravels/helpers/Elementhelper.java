package com.atmecs.phptravels.helpers;

import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.phptravels.utils.PropertyReader;

import junit.framework.Assert;

public class Elementhelper {
WebDriver driver;
	
    
		
	public void clickElement(WebDriver driver,String path, String element) {
		Properties chat_path =PropertyReader.readProperties(path);
		String xpath=chat_path.getProperty(element);
		driver.findElement(By.xpath(xpath)).click();
	}

	public void sendKeys(WebDriver driver,String path,String details_path, String element, String text) {
		Properties chat_path= PropertyReader.readProperties(path);
		String xpath=chat_path.getProperty(element);
		Properties properties= PropertyReader.readProperties(details_path);
		String data=properties.getProperty(text);
		driver.findElement(By.xpath(xpath)).sendKeys(data);
		
	}

	
	public void explicitWait(WebDriver driver,String path, String element) {
		Properties chat_path= PropertyReader.readProperties(path);
		String xpath=chat_path.getProperty(element);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
     	element1.click();
	}
	public void selectFromDropdown(WebDriver driver,String path,String value_path,String element,String valueToSelect)
	{
		Properties chat_path= PropertyReader.readProperties(path);
		String xpath=chat_path.getProperty(element);
		Properties properties = PropertyReader.readProperties(value_path);
		String value=properties.getProperty(valueToSelect);
	    Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
	    dropdown.selectByVisibleText(value);
	
	}
	
}
