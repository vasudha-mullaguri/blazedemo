package com.atmecs.blazedemo.testscripts;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.constants.Constant;
import com.atmecs.blazedemo.helpers.Elementhelper;
import com.atmecs.blazedemo.pages.Signuppage;
import com.atmecs.blazedemo.testsuite.Basetest;
import com.atmecs.blazedemo.utils.PropertyReader;

import javafx.scene.control.Alert;
import junit.framework.Assert;

public class Testsignup extends Basetest{
	
	 public void userSignup() {
		 Signuppage signin=new Signuppage();
		 signin.signup();
	 }
   
   
     
   

	   
   }
   
