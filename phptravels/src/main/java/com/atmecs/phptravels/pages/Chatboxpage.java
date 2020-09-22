package com.atmecs.phptravels.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.phptravels.constants.Constant;
import com.atmecs.phptravels.helpers.Elementhelper;

public class Chatboxpage {
	WebDriver driver;
	
	public void iframeChatBox(){
		Elementhelper elementhelper=new Elementhelper();

	driver.switchTo().frame("chat-widget");
	
	elementhelper.explicitWait(driver,Constant.CHATBOX_FILE,"chat_box");
	
	//Commonhelpers.explicitWait(driver, chat_loc.getProperty("chatnow_button"));
	
	elementhelper.sendKeys(driver,Constant.CHATBOX_FILE,Constant.CONFIG_FILE, "name", "name");
	
	elementhelper.sendKeys(driver,Constant.CHATBOX_FILE,Constant.CONFIG_FILE,"whatsapp_number", "whatsapp_number");
	
	elementhelper.sendKeys(driver,Constant.CHATBOX_FILE,Constant.CONFIG_FILE,"email_name", "email");
	
	elementhelper.selectFromDropdown(driver,Constant.CHATBOX_FILE,Constant.CONFIG_FILE,"client_dropdown", "select_option");
	
	elementhelper.clickElement(driver,Constant.CHATBOX_FILE,"startchat_button");
	
	elementhelper.sendKeys(driver,Constant.CHATBOX_FILE,Constant.CONFIG_FILE, "message_text","message");
	
	elementhelper.clickElement(driver,Constant.CHATBOX_FILE,"send_button");
	
	elementhelper.clickElement(driver,Constant.CHATBOX_FILE,"minimize_button");
	
	
}
}