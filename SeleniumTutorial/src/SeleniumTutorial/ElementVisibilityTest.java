package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {

		/*What is the difference between the isPresent and isDisplayed methods
		 * 
		 * isDisplayed() - Your element is present on the page but it is displayed.
		 * 
		 * isPresent() - Your element is present in entire DOM of the page. Probably it
		 * can be hidden or disabled, but present.
		 * 
		 * You should not use isPresent() when you need to validate on specific element
		 * you are searching, rather you can use it to validate some other checks based
		 * on that element's presence.
		 */
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\Swapnil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
		driver.manage().deleteAllCookies();

		// isDisplayed() method ----> applicable for all element
		boolean b1 = driver.findElement(By.xpath("//button[@id='submitButton']")).isDisplayed(); // submit button
		System.out.println(b1); // true

		// isEnabled() method
		boolean b2 = driver.findElement(By.xpath("//button[@id='submitButton']")).isEnabled(); // submit button
		System.out.println(b2); // true

		// isSelected()---> radio buttons, dropdowns and checkboxes.
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		boolean b3 = driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
		System.out.println(b3); // true

	}

}
