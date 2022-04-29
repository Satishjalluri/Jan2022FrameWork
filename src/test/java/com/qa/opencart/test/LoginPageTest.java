package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.Constants;

public class LoginPageTest extends BaseTest {
	
	
	@Test
	public void loginPageTest() {
		String actTitle = loginPage.getLoginPageTitle();
		System.out.println("page title :" +actTitle);
		Assert.assertEquals(actTitle, Constants.LOGIN_PAGE_TITLE);
		
	}
	
	@Test
	public void loginPageUrlTest() {
		String url = loginPage.getLoginPageUrl();
		System.out.println("Page url :" + url);
		Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_FRACTION_URL));
	}
	
	@Test
	public void forgotPwdLinkTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}
	
	@Test
	public void loginTest() {
		loginPage.doLogin("naveenanimation20@gmail.com", "Selenium12345");
	}

}
