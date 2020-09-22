package com.atmecs.blazedemo.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.constants.Constant;
import com.atmecs.blazedemo.helpers.Elementhelper;
import com.atmecs.blazedemo.testsuite.Basetest;
import com.atmecs.blazedemo.utils.PropertyReader;


public class Loginpage {
	WebDriver driver;
public void login() {
	Elementhelper elementhelper=new Elementhelper();
	
	   //click on login
	  elementhelper.explicitWait(driver, Constant.PAGE_FILE,"login_page");
	   
	   //enter the username
	   
	   elementhelper.sendKeys(driver,Constant.PAGE_FILE,Constant.CONFIG_FILE,"login_username","login_username");
	   
	   //Enter Password
	   
	   elementhelper.sendKeys(driver,Constant.PAGE_FILE,Constant.CONFIG_FILE,"login_password","login_password");
	   
	   //press login button
		elementhelper.clickElement(driver,Constant.PAGE_FILE,"login_button");
}
	   
	   }



