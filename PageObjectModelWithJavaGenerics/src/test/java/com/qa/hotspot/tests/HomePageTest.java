package com.qa.hotspot.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class HomePageTest extends BaseTest {

	@Test(priority = 1)
	public void homePageTitleTest() {
		page.getInstance(LoginPage.class).doLogin("swapnil.bodade358@gmail.com", "Qwerty@123");
		String hometitle = page.getInstance(HomePage.class).homePageTitle();
		System.out.println(hometitle);
		assertEquals(hometitle, "Cogmento CRM");
	}

	@Test(priority = 2)
	public void verifyHomePageDisplayTest() {
		page.getInstance(LoginPage.class).doLogin("swapnil.bodade358@gmail.com", "Qwerty@123");
		boolean homeDis = page.getInstance(HomePage.class).verifyHomePageDisplay();
		System.out.println(homeDis);
	}
	
	

}
