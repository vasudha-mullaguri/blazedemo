package com.atmecs.blazedemo.testscripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.constants.Constant;
import com.atmecs.blazedemo.helpers.Elementhelper;
import com.atmecs.blazedemo.pages.Contactpage;
import com.atmecs.blazedemo.testsuite.Basetest;
import com.atmecs.blazedemo.utils.PropertyReader;

public class Testcontact extends Basetest{
	
	@Test
    public void contact(){
		Contactpage contact=new Contactpage();
		contact.contactFunctionality();
		
  }
  

}
