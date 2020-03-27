package SeleniumTutorial;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	WebDriver driver = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");

		clickOn(driver, driver.findElement(By.name("btnK")), 20);
	}

	// explicit wait
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

	/*
	 * Fluent Wait- The Fluent Wait command defines the maximum amount of time for
	 * Selenium WebDriver to wait for a certain condition to appear.It also defines
	 * the frequency with which WebDriver will check if the condition appears before
	 * throwing the “ElementNotVisibleException”.
	 */

//Syntax:
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40))
			.pollingEvery(Duration.ofSeconds(8)).ignoring(Exception.class);

	WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
     public WebElement apply(WebDriver driver) {
       return driver.findElement(By.xpath("xpath"));
     }
   });
}
