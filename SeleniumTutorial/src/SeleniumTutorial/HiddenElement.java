package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.get("http://seleniumpractise.blogspot.com/2016/08");
		driver.findElement(By.xpath("http://seleniumpractise.blogspot.com/2016/08")).click();
	}

}
