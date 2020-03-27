package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\Swapnil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		/*
		 * //Dynamic wait 
		 * PageLoadTimeOut - One of the timeouts is focused on the time a
		 * webpage needs to be loaded – the pageLoadTimeout limits the time that the
		 * script allots for a web page to be displayed. Page load timeout is useful
		 * when we perform a performance test. Page Load timeout is applicable only to
		 * driver.get() and driver.navigate().to() methods in selenium.
		 */
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		/*
		 * Implicit Wait - Implicit waits are used to provide a default waiting time (say
		 * 30 seconds) between each consecutive test step/command across the entire test
		 * script. Implicitly wait is applied globally, which means it is always
		 * available for all the web elements throughout the driver instance. It implies
		 * that if the driver is interacting with 100 elements, then implicitly wait is
		 * applicable for all the 100 elements.
		 */
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

}
