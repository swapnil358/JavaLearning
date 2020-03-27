package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenBroswerTabs {
	
	public static void main(String[] a) throws InterruptedException {  
	     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");		
		   // Initialize driver  
		      WebDriver driver = new ChromeDriver();  
		      //Maximize browser window   
		      driver.manage().window().maximize();  
		      
		      //Go to URL  
		      driver.get("http://www.google.com");  
		      //Set timeout  
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		      
		      // Open new tab  
		      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");  
		      //Go to URL  
		      driver.get("http://www.gmail.com");  
		      //Set new tab timeout  
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		      // Do some operation      
		      driver.findElement(By.id("gmail-sign-in")).click();  
		      driver.findElement(By.id("Email")).sendKeys("WebDriver");  
		      driver.findElement(By.id("Passwd")).sendKeys("WebDriver");  
		      driver.findElement(By.id("signIn")).click();  
		      Thread.sleep(2000);  
		      
		      // Switch first tab  
		      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");  
		      driver.switchTo().defaultContent();  
		      Thread.sleep(2000);  
		      // Write search String  
		      driver.findElement(By.id("gbqfq")).sendKeys("WebDriver");  
		      // Click on Search button      
		      driver.findElement(By.id("gbqfb")).click();  
		      Thread.sleep(2000);  
		      
		     // Browser close   
		      driver.close();  
		   }  
		 

}
