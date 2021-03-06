package com.qaengineer.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

/*
 * NB: Elements in the form are not accessible by either, css,name,xpath 
 * They might be a problem with the page
 */

public class AddUserPageObject {
	
	//Declare webdriver variable
	WebDriver ldriver;
	
	//Initialize webdriver
	public AddUserPageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Elements or ID's
	@FindBy(name="your_name")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(name="mobilephone")
	@CacheLookup
	WebElement txtMobileNo;
	
	@FindBy(xpath="//*[@id=\"numemployees-c2e387f9-4bd8-496f-ab2a-81fbbc31712a\"]/option[2]")
	@CacheLookup
	WebElement dropDNumEmployees;
	
	@FindBy(xpath = "//*[@id=\"what_kind_of_problem_is_your_business_currently_facing_-c2e387f9-4bd8-496f-ab2a-81fbbc31712a\"]/option[2]")
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
		txtName.sendKeys(fName);
	}
	
	public void  userEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void  userMobileNum(String mobileNum) {
		txtMobileNo.sendKeys(mobileNum);
	}
	
	public void userNumEmployees() {
		dropDServiceKind.click();
	}
	
	public void userWhatKindOfBus() {
		dropDNumEmployees.click();
	}
	
	public void userClickCons() {
		checkLegalCons.click();
	}
	
	public void  userMessage(String userMsg) {
		txtMessage.sendKeys(userMsg);
	}
	
	public void userClickSubBtn() {
		btnSubmit.click();
	}
	

}
