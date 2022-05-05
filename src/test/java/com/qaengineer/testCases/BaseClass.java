package com.qaengineer.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "https://www.sovtech.co.za/contact-us/";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//Close browser when done
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
