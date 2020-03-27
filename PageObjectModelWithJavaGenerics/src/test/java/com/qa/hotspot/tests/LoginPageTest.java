package com.qa.hotspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.LoginPage;

public class LoginPageTest extends BaseTest{

	
	
	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).GetLoginPageTitle();
		System.out.println("login page title is"+" "+title);
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority = 2)
	public void verifydoLoginTest() {
	
		page.getInstance(LoginPage.class).doLogin("swapnil.bodade358@gmail.com", "Qwerty@123");
		
	}

	 
	
}
