package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GenericMethod {
	
	WebDriver driver;
	
	
	public static void ClickOn(WebDriver driver, WebElement element) {
		element.click();
	}
	
	public static void EnterText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void ImplicitWait() {
		
	}
		
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
	}
	
	
	@Test
	public void ClickonTest() {
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
