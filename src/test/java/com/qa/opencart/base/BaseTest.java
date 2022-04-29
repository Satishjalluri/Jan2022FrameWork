package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	public DriverFactory df;
	public WebDriver driver;
	public LoginPage loginPage;
	
	@BeforeTest
	public void setup() {
		
		df = new DriverFactory();
		driver = df.init_driver("chrome");
		loginPage = new LoginPage(driver);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
