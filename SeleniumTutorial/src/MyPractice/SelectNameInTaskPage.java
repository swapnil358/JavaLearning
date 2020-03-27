package MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectNameInTaskPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\Swapnil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("swapnilautomation");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");

		driver.findElement(By.xpath("//a[contains(text(),'Tasks')]")).click();

		String Before_xpath = "//body/table/tbody/tr/td/table/tbody/tr/td/form[@name='TASKSEARCH']/table[@class='datacard']/tbody/tr[";

		String After_xpath = "]/td[2]";

		Thread.sleep(1000);

		for (int i = 3; i <= 13; i++) {

			String tsk = driver.findElement(By.xpath(Before_xpath + i + After_xpath)).getText();
			System.out.println(tsk);
			Thread.sleep(500);
			if (tsk.contains("mytask")) {
				WebElement john = driver.findElement(By.xpath(
						"//body/table/tbody/tr/td/table/tbody/tr/td/form[@name='TASKSEARCH']/table[@class='datacard']/tbody/tr["
								+ i + "]/td[2]/a"));
				john.click();
				break;

			}

		}
		// driver.quit();

	}

}
