package HashMapConceptInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCrmTest {

	WebDriver driver;
	
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://https://classic.freecrm.com/index.html");
		
				
		driver.navigate().to("https://www.yahoo.com");
		driver.get("https://www.google.com");
		
	}

}
