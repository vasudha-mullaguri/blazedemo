package com.atmecs.blazedemo.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.constants.Constant;
import com.atmecs.blazedemo.helpers.Elementhelper;
import com.atmecs.blazedemo.utils.PropertyReader;

public class Signuppage {
      WebDriver driver;
  
		   public void signup(){
			   
			   Elementhelper elementhelper=new Elementhelper();
		   	   
			   //click on signup
			   
			   elementhelper.explicitWait(driver,Constant.PAGE_FILE,"singup_page");

			   //Enter username
			   
			   elementhelper.sendKeys(driver,Constant.PAGE_FILE,Constant.CONFIG_FILE ,"sign_username","sign_username");
			   
			   //Enter Password
			   elementhelper.sendKeys(driver,Constant.PAGE_FILE,Constant.CONFIG_FILE,"sign_password","sign_password");
			   
			   //press signup button
			   
			   elementhelper.explicitWait(driver,Constant.PAGE_FILE,"sign_button");
			   
			   driver.switchTo().alert().accept();
			   
			  
			   }
	   
}
