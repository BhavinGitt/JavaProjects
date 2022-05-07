package com.inetBankingProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBankingProject.pageObject.LoginPage;
import com.inetBankingProject.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	@Test(dataProvider="LoginDta")
	public void LoginDDT(String uname,String pword) {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		logger.info("user name provided");
		lp.setPassWord(pword);
		logger.info("password provided");
		lp.clickSubmit();
		
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login failed");
		}
		else {
			Assert.assertTrue(true);
			logger.info("login passed");
			lp.logoutButton();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
	}

	
	public boolean isAlertPresent() {
		try {
		driver.switchTo().alert();
		return true;
		}
		catch(Exception e){
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@DataProvider(name = "LoginDta")
	public String[][] getData() throws IOException {
		String path = "C:\\Users\\java\\eclipse-workspace\\inetBankingProject\\src\\test\\java\\com\\inetBankingProject\\testData\\LoginTestData.xlsx";
		int rownum = XLUtils.getRowCount(path, "sheet1");
		int colcont = XLUtils.getCellCount(path, "sheet1", 1);

		String logindata[][] = new String[rownum][colcont];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcont; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);// 1 0

			}

		}
		return logindata;
	}

}
