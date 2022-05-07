package com.inetBankingProject.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetBankingProject.pageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginPage_001 extends BaseClass {
	@Test
	public void loginTest() throws IOException {
		
		logger.info("URL is open now");
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(urername);
		logger.info("enetered username");

		lp.setPassWord(password);
		logger.info("enetered password");
		lp.clickSubmit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test Passed");

		} else {
			captureScreen(driver, "loginTest" );
			Assert.assertTrue(false);
			logger.info("login test FAILED");
			
			
		}

	}

}
