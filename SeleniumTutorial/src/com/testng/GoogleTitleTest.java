package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver = null; // initalisng webdriver instance, so that i can use it throughout my class

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");

		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();

		Assert.assertEquals(title, "Google", "title is not matched");

		if (title.equalsIgnoreCase("google")) {
			System.out.println("title varified");
		}
		System.out.println("wrong title");

	}

	@Test
	public void googleLogoTest() {

		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
