package SeleniumTutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	public static WebDriver driver;
	public static String URL;
	
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("/Users/n/eclipse-workspace/WebDriverPracticeByNaveen/SeleniumTutorial/src/SeleniumTutorial/config.properties");
		
		prop.load(ip);
		
		String Name = prop.getProperty("name");
		System.out.println(Name);
		
		String Age = prop.getProperty("age");
		System.out.println(Age);
		
		String URL = prop.getProperty("url");
		System.out.println(URL);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\n\\Desktop\\geckodriver\\geckodriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\internetexplorerdriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(URL);
		
		driver.findElement(By.xpath(prop.getProperty("first_xpath"))).sendKeys(prop.getProperty("first"));
		driver.findElement(By.name(prop.getProperty("last_xpath"))).sendKeys(prop.getProperty("last"));
		
	}

}
