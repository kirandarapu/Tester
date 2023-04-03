package com.Fundraiser.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	//create parameterized constructor
	
	public LoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="user_email")
	@CacheLookup  //this is optional
	WebElement txtemail;
	
	@FindBy(id="user_password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="submitLogin")
	@CacheLookup
	WebElement btnlogin;
	
	
	public void setusermail(String umail){
		txtemail.sendKeys(umail);
	}
	
	public void setPassword(String pwd){
		txtpassword.sendKeys(pwd);
	}
	
	public void clickLoginbtn(){
		btnlogin.click();
	}

}
