package com.Fundraiser.Testcases;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Fundraiser.PageObjects.LoginPage;

import junit.framework.Assert;

public class TC_Login_001 extends BaseClass {
	
	//create Test Methods
	@Test
	public void  logintest() throws InterruptedException, IOException{
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setusermail(Email);
		Thread.sleep(3000);
		System.out.println("username is entered");
		logger.info("the username is entered");
		lp.setPassword(password);
		//System.out.println("password enteredd");
		logger.info("password is entered");
		lp.clickLoginbtn();
		logger.info("the login button is clicked");
		
		logger.info(driver.getTitle());
		
		if(driver.getTitle().equals("My profile : Fundraiser11")){
			
			Assert.assertTrue(true);
		}else
			CaptureScreen(driver,"login test");
			Assert.assertTrue(false);
			logger.info("login is failed");
		{
			Assert.assertTrue(false);
		}
		
	}

}
