package com.qaengineer.testCases;




import java.io.IOException;


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
		
		if(addUserPageObj.userSuccessMsg()) {
			logger.info("Adding user successful");
		}else {
			captureScreen(driver,"AddUser");
			logger.info("Adding user Failed");
		}

		
	}
	

}
