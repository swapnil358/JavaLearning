package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessBrowserConcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\Swapnil\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	WebDriver driver = new HtmlUnitDriver();                       //HeadlessBrowser driver
		
		driver.get("https://classic.crmpro.com");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		WebElement lgnBttn = driver.findElement(By.xpath("//input[@type='submit']"));
		lgnBttn.click();
		
		System.out.println(driver.getTitle());
		
		
	}

}
