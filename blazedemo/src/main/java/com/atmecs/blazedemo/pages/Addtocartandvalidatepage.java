package com.atmecs.blazedemo.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.constants.Constant;
import com.atmecs.blazedemo.helpers.Elementhelper;
import com.atmecs.blazedemo.utils.PropertyReader;

import junit.framework.Assert;

public class Addtocartandvalidatepage {
	
	WebDriver driver;
	Properties val_path;
	  
  public void addCart(){
	  Elementhelper elementhelper=new Elementhelper();
		   //click on product
		   elementhelper.explicitWait(driver,Constant.PAGE_FILE ,"product");
		   
		   //click on addproduct
		   elementhelper.clickElement(driver,Constant.PAGE_FILE, "addproduct_button");
		   
		// driver.switchTo().alert().accept();
		   
	   }
	     @Test(priority=1)
		   public void validate(){
	    	 
	    	 val_path=PropertyReader.readProperties(Constant.VALIDATION_FILE);
	    	 
	    	//driver.switchTo().alert().accept();
	    	// elementhelper.explicitWait( "val_path.getProperty("cart_page")");
		    String actual="Samsung galaxy s6";
		    String expected=driver.findElement(By.xpath("//td[text()='Samsung galaxy s6']")).getText();
		   Assert.assertEquals(actual, expected);
		   System.out.println("Assertion passed");
	   }


}
