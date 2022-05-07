package com.inetBankingProject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is :" + e.getMessage());
		}
	}

	public String getApplicationURL() {

		String url = pro.getProperty("baseURL");
		return url;

	}

	public String getUserName() {

		String urername = pro.getProperty("urername");
		return urername;

	}
	public String getPassword() {

		String password = pro.getProperty("password");
		return password;

	}
	
	public String getChromePath() {

		String chromepath = pro.getProperty("chromepath");
		return chromepath;

	}
	
	public String getFireFoxPath() {

		String firefox = pro.getProperty("firefox");
		return firefox;

	}
}
