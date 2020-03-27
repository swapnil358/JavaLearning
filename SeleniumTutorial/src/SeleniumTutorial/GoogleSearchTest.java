package SeleniumTutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("testing");
		
		//List <WebElement> list = driver.findElements(By.tagName("ul"));
		Thread.sleep(2000);
		List <WebElement> list = driver.findElements(By.xpath("//div[@class='UUbT9']//li/descendant::div[@class='sbl1']"));
		System.out.println("list is--->"+ list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("testing life cycle")) {
			Thread.sleep(1000);
			list.get(i).click();
			break;
		}
		
		}
		
	}

}
