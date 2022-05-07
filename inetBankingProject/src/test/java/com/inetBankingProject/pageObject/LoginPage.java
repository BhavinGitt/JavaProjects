package com.inetBankingProject.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement username;

	@FindBy(name = "password")
	@CacheLookup
	WebElement password;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement clickButton;

	
	@FindBy(linkText = "Log out")
	@CacheLookup
	WebElement logout;
	
	public void setUserName(String uname) {
		username.sendKeys(uname);

	}

	public void setPassWord(String pwd) {
		password.sendKeys(pwd);

	}

	public void clickSubmit() {
		clickButton.click();

	}
	
	public void logoutButton() {
		logout.click();

	}

}
