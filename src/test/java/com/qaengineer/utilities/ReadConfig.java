package com.qaengineer.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
   //Read the config File from folder Configuration
	public ReadConfig() {
		File src = new File("./Configuration/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
   //Return Application URL
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	//Get Driver paths : chrome, fireFox and i.e
	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getGeckoPath() {
		String geckopath = pro.getProperty("geckopath");
		return geckopath;
	}
	
	public String getMsEdgePath() {
		String msedgepath = pro.getProperty("msedgepath");
		return msedgepath;
	}
	
	

}
