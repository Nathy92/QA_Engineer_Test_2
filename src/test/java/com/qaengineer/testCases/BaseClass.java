package com.qaengineer.testCases;


import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qaengineer.utilities.ReadConfig;




public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	public static WebDriver driver;
	public static Logger logger;
	public String baseURL = readConfig.getApplicationURL() ;
	
	public String fname = "Nkosi"; 
	public String email = "fannie@gmail.com";
	public String cellNum = "+27 712353978" ;
	public String message = "I am I am I am";	
	
	
	
	@BeforeClass
	public void setUp() {

		//Get method from ReadConfig Class
		System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
		driver = new ChromeDriver();
		
		Logger logger = Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("Log4j.properties");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	/*
	//Capture Screenshot Method
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	*/
	

}
