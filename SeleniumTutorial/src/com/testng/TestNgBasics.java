package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	/*
	 *
@BeforeSuite --setup system property for chrome--1
@BeforeTest  --launchBrowser-- 2
@BeforeClass --login to app -- 3

@BeforeMethod --- enter URL --4
@Test --google logo test
@AfterMethod -- logout from App

@BeforeMethod --- enter URL
@Test -- Google Title Test
@AfterMethod -- logout from App

@BeforeMethod --- enter URL
@Test -- search test
@AfterMethod -- logout from App

@AfterClass --- close Browser
@AfterTest  ---deleteAllCookies
	 */
	
	

	//Pre - condition annotations  --- starting with @After
	
	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite --setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest  --launchBrowser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("@BeforeClass --login to app");
	}

	/*
	 * 
	 * @BeforeMethod
	 * @Test -1
	 * @AfterMethod
	 * 
	 * 
	 * @BeforeMethod
	 * @Test - 2
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test - 3
	 * @AfterMethod
	 * 
	 * 
	 * */
	 
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("@BeforeMethod --- enter URL");
	}


	//Test cases --- staring with @Test
	@Test  //5
	public void googleTitleTest() {
		System.out.println("@Test -- Google Title Test");
	}
	
	
	@Test
	public void searchTest() {
		System.out.println("@Test -- search test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test --google logo test");
	}
	
	
	//post-condition annotations  --- starting with @After
	
	@AfterMethod //6
	public void logOut() {
		System.out.println("@AfterMethod -- logout from App");
	}

	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("@AfterClass --- close Browser");
	}

	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest  ---deleteAllCookies");
	}
	
	
	
	
}
