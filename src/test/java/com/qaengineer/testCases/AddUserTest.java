package com.qaengineer.testCases;




import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaengineer.pageObjects.AddUserPageObject;

public class AddUserTest extends BaseClass {
	
	@Test
	public void AddUser() throws IOException {
		
		
		driver.get(baseURL);
	    logger.info("URL Opened");
		
		AddUserPageObject addUserPageObj = new AddUserPageObject(driver);
		logger.info("Entering User Details");
		addUserPageObj.userFname(fname);
		addUserPageObj.userEmail(email);
		addUserPageObj.userMobileNum(cellNum);
		addUserPageObj.userNumEmployees();
		addUserPageObj.userWhatKindOfBus();
		addUserPageObj.userClickCons();
		addUserPageObj.userMessage(message);
		addUserPageObj.userClickSubBtn(); 
		logger.info("User Details Captured");
		
		//Check if Success page Title is visible
		if(driver.getTitle().equals("Submission Contact Us - SovTech Custom Software")) {
			Assert.assertTrue(true);
			logger.info("Adding User Test Passed");
			
		}else {
			captureScreen(driver, "AddUser");
			Assert.assertFalse(false);
			logger.info("Adding User Test Failed");
		}
		
	
	}
	

}
