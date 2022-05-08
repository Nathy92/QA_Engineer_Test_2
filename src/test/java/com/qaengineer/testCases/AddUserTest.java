package com.qaengineer.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qaengineer.pageObjects.AddUserPageObject;

public class AddUserTest extends BaseClass {
	
	@Test
	public void AddUser() {
		
		driver.get(baseURL);
		WebDriverWait wait = new WebDriverWait(driver,5); 
		driver.findElement(By.xpath("//*[@id=\"your_name-c2e387f9-4bd8-496f-ab2a-81fbbc31712a\"]")).sendKeys("Nkosin");
		//WebDriverWait wait = new WebDriverWait(driver,5); 
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement fname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		//fname.sendKeys("James");
		//driver.findElement(By.name("your_name")).sendKeys("Nkosin");
		//driver.findElement(By.xpath("//h2[@class='section-title']")).sendKeys("Successs");
		
		//driver.findElement(By.xpath("//input[@name='your_name']")).sendKeys("Nkosin");
		
	
		/*
		
		AddUserPageObject addUserPageObj = new AddUserPageObject(driver);
		
		addUserPageObj.userFname(fname);
		addUserPageObj.userEmail(email);
		addUserPageObj.userMobileNum(cellNum);
		addUserPageObj.userMessage(message);
	*/
	
		
	}
	

}
