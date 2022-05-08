package com.qaengineer.testCases;




import org.testng.annotations.Test;

import com.qaengineer.pageObjects.AddUserPageObject;

public class AddUserTest extends BaseClass {
	
	@Test
	public void AddUser() {
		
		driver.get(baseURL);
		logger.info("URL Opened");
		
		AddUserPageObject addUserPageObj = new AddUserPageObject(driver);
		logger.info("Entering User Details");
		addUserPageObj.userFname(fname);
		addUserPageObj.userEmail(email);
		addUserPageObj.userMobileNum(cellNum);
		addUserPageObj.userMessage(message);
		logger.info("User Details Captured");

		
	}
	

}
