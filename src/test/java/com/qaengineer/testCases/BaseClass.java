package com.qaengineer.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qaengineer.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	public static WebDriver driver;
	public static Logger logger;
	public String baseURL = readConfig.getApplicationURL();

	public String fname = "Nkosi";
	public String email = "testing@gmail.com";
	public String cellNum = "+27 712353978";
	public String message = "Testing Testing Testing Testing";

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {

		Logger logger = Logger.getLogger("QA Engineer Test");
		PropertyConfigurator.configure("Log4j.properties");

		// Get method's from ReadConfig Class
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			driver = new ChromeDriver();

		} else if (br.equals("fireFox")) {
			System.setProperty("webdriver.gecko.driver", readConfig.getGeckoPath());
			driver = new FirefoxDriver();

		} else if (br.equals("msEdge")) {
			System.setProperty("webdriver.edge.driver", readConfig.getMsEdgePath());
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	// Screenshot method
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
