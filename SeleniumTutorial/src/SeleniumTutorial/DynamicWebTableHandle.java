package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("swapnilautomation");

		driver.findElement(By.name("password")).sendKeys("test@123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.xpath("//a[contains(text(), 'Contact')]")).click();

		
		
		
		/*1. Get te xapth and observe the xpath
		 *2. Store Before Xpath and After Xpath into different veriable
		 *3. Get the size of the table.
		 *4. Ieterate using 'For' loop
		 *
		 * 
		
		*/
		/*
		 * 
		 * //*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]
		 * //*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]
		 * //*[@id="vContactsForm"]/table/tbody/tr[6]/td[2] . . .
		 * //*[@id="vContactsForm"]/table/tbody/tr[20]/td[2]
		 * 
		 */

		String Before_Xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String After_Xpath = "]/td[2]/a";

		Thread.sleep(3000);
		 
	//	List<WebElement> list = driver.findElements(By.tagName("tbody"));
	//	System.out.println(list.size());

		for (int i = 4; i < 24; i++) {
			String name = driver.findElement(By.xpath(Before_Xpath + i + After_Xpath)).getText();
			System.out.println(name);
			if (name.contains("swapnil bodade")) {
				//driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[" + i + "]/td[2]/a")).click();
				driver.findElement(By.xpath(Before_Xpath + i + After_Xpath)).click();
				System.out.println("clicked");
			}
		}
		

	}

}
