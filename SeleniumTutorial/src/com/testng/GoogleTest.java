package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	ChromeDriver driver = null; // initalisng webdriver instance, so that i can use it throughout my class

	@BeforeMethod
	public void setUp() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(cap);
		//driver = new ChromeDriver(cap);
		options.addArguments("--disable-extensions");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	@Test(priority = 3, groups = "logo")
	public void googleLogoTest() {
		boolean logo = driver.findElement(By.xpath("//div[@id =\"logo-non-white\"]")).isDisplayed();

	}

	@Test(priority = 2, groups = "Link Test")
	public void mailLinkTest() {
		boolean link = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@Test(priority = 4, groups = "Test")
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = 5, groups = "Test")
	public void test2() {
		System.out.println("test2");
	}

	@Test(priority = 6, groups = "Test")
	public void test3() {
		System.out.println("test3");
	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
}
