package SeleniumTutorial;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\Swapnil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com");

		
		/************************************
		 * Capture Screenshot               *
		 ************************************ 
		 */

		/* Create object of File class of Java 
		 * And capture screenshot using getScreenshotAs() method of Webdriver
		 * Set Output type of screenshot taken as 'File'
		*/
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		/* Use FileUtils class of Java 
		 * Call it's copyFile method
		 * Copy screenshot file to a location with some name and extension you want
		
		FileUtils.copyFile(screenshot, new File("D:\\screenshot.jpg"));
		  */
		
		}
}
