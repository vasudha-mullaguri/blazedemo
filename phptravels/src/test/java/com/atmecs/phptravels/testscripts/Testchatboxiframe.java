package com.atmecs.phptravels.testscripts;

import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.phptravels.constants.Constant;
import com.atmecs.phptravels.helpers.Elementhelper;
import com.atmecs.phptravels.pages.Chatboxpage;
import com.atmecs.phptravels.testsuits.Basetest;
import com.atmecs.phptravels.utils.PropertyReader;

public class Testchatboxiframe extends Basetest{
	
	@Test
	public void chatbox(){
		Chatboxpage chatbox=new Chatboxpage();
		chatbox.iframeChatBox();
		
	}
	
	

}
