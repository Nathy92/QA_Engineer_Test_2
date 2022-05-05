package com.qaengineer.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.qaengineer.testCases.BaseClass;

public class AddUserPage extends BaseClass {
	
	//Declare webdriver variable
	WebDriver ldriver;
	
	//Initialize webdriver
	public AddUserPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(name="your_name")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(name= "email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(name="mobilephone")
	@CacheLookup
	WebElement txtMobileNo;
	
	@FindBy(name="numemployees")
	@CacheLookup
	WebElement dropDNumEmployees;
	
	@FindBy(name = "what_kind_of_problem_is_your_business_currently_facing_")
	@CacheLookup
	WebElement dropDServiceKind;
	
	@FindBy(name="message")
	@CacheLookup
	WebElement txtMessage;
	
	@FindBy(name="LEGAL_CONSENT.subscription_type_10841063")
	@CacheLookup
	WebElement checkLegalCons;
	
	@FindBy(xpath="//input[@class='hs-button primary large']")
	@CacheLookup
	WebElement btnSubmit;
	
	public void  userFname(String fName) {
		txtName.sendKeys("Nkosinathi");
	}
	
	public void  userEmail(String email) {
		txtEmail.sendKeys("jacob@gmail.com");
	}
	
	public void  userMobileNum(String mobileNum) {
		txtMobileNo.sendKeys("+27 712353978");
	}
	
	
	/*
	 * 1. Do Company size
	 * 2. Service
	 */
	public void  userMessage(String userMsg) {
		txtMessage.sendKeys("My Enquiry My Enquiry");
	}
	
	
	public void clickAgrmnt() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
