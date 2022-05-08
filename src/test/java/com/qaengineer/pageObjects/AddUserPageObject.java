package com.qaengineer.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class AddUserPageObject {
	
	//Declare webdriver variable
	WebDriver ldriver;
	
	//Initialize webdriver
	public AddUserPageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(name="your_name")
	
	WebElement txtName;
	
	@FindBy(name="email")
	
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
	
	@FindBy(xpath="//h2[@class='section-title']")
	@CacheLookup
	WebElement txtSuccessMsg;
	
	
	public void  userFname(String fName) {
		txtName.sendKeys(fName);
	}
	
	public void  userEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void  userMobileNum(String mobileNum) {
		txtMobileNo.sendKeys(mobileNum);
	}
	
	
	/*
	 * 1. Do Company size
	 * 2. Service
	 */
	public void  userMessage(String userMsg) {
		txtMessage.sendKeys(userMsg);
	}
	
	
	public void clickAgrmnt() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}