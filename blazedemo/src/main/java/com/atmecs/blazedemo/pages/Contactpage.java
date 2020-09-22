package com.atmecs.blazedemo.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.constants.Constant;
import com.atmecs.blazedemo.helpers.Elementhelper;

public class Contactpage {
	 WebDriver driver;
	
	public void contactFunctionality(){
		Elementhelper elementhelper=new Elementhelper();
		
	elementhelper.explicitWait(driver,Constant.PAGE_FILE,"contact_page");
	   
	   //enter the username
		elementhelper.sendKeys(driver,Constant.PAGE_FILE,Constant.CONFIG_FILE,"contact_email", "contact_email");
	   
	   //Enter Password
		elementhelper.sendKeys(driver,Constant.PAGE_FILE,Constant.CONFIG_FILE,"contact_name", "contact_name");
	   
	   //Enter message
		elementhelper.sendKeys(driver,Constant.PAGE_FILE,Constant.CONFIG_FILE,"message_text","contact_message");
	   
	   //press login button
		elementhelper.clickElement(driver,Constant.PAGE_FILE,"sendmessage_button");
	  
	   driver.switchTo().alert().accept();
	   

}
}
