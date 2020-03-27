package SeleniumTutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelectionPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		List <WebElement> check = driver.findElements(By.xpath("//div[@class='panel-body']//div//input[@class=\"cb1-element\"]"));
		System.out.println("check Box size is---->"+""+check.size());
		
		for(int i = 0; i<check.size(); i++) {
			System.out.println(check.get(i).getText());
			
		}
		
		
		
	}

}
