package com.datadriven.test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbayTest {
	
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		

	}

	@DataProvider
	public ArrayList<Object[]> getLoginData() {
		
//		ArrayList<Object[]> testData = testUtil.getDataFromExcel();
//		testData.iterator();
		return null;
	}
	
	@Test(dataProvider = "getLoginData")
	public void halfEbaytest() {
		
		driver.findElement(By.xpath("usernameXpath")).sendKeys("username");
		driver.findElement(By.xpath("passwordXpath")).sendKeys("password");
		
	}
	
	

}
