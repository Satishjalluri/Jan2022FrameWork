package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. private by locators

	private By emailid = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By forgotPwd = By.linkText("Forgotten Password");
	private By forgotPwd2 = By.linkText("Forgotten Password2");
	
	private By logOut = By.linkText("Logout11");
	

	// 2. public page constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	// 3. Public Page actions

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public String getLoginPageUrl() {
		return driver.getCurrentUrl();

	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwd).isDisplayed();
	}

	public void doLogin(String un, String pwd) {
		driver.findElement(emailid).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}

}
