package com.atmecs.blazedemo.testscripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.constants.Constant;
import com.atmecs.blazedemo.helpers.Elementhelper;
import com.atmecs.blazedemo.pages.Addtocartandvalidatepage;
import com.atmecs.blazedemo.testsuite.Basetest;
import com.atmecs.blazedemo.utils.PropertyReader;

import junit.framework.Assert;

public class Testaddtocartandvalidate extends Basetest{
	
	
	@Test
	 public void addProduct(){
		Addtocartandvalidatepage addproduct=new Addtocartandvalidatepage();
		addproduct.addCart();
		addproduct.validate();
	}
	   
}
