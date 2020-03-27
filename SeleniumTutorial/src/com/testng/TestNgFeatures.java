package com.testng;

import org.testng.annotations.Test;

public class TestNgFeatures {

	
	@Test
	public void loginPageTest() {
	System.out.println("login test");	
	//int i = 9/0;
	}

	
	@Test(dependsOnMethods="loginPageTest")
	public void HomePageTest() {
		System.out.println("home page test");
	}

	@Test(dependsOnMethods="loginPageTest")
	public void SearchPageTest() {
	System.out.println("Search Pagetest");	
	
	}
	
	@Test(dependsOnMethods="loginPageTest")
	public void REgistrationPageTest() {
	System.out.println("Registration Page test");	
	}
	
}
