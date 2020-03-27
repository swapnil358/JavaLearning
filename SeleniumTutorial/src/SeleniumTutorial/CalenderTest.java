package SeleniumTutorial;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies(); //to delete the coockies

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("swapnilautomation");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");

		driver.findElement(By.xpath("//a[contains(text(),'Calendar')]")).click();

		String date = "31-September-2018";
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);

		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[3]
		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]
		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]
		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]
		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[7]/td[1]

		String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";

		String AfterXpath = "]/td[";

		final int totalWeekDays = 7;
		String dayVal = null;

		boolean flag = false;

		for (int rowNum = 2; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= totalWeekDays; colNum++) {

				try {

					dayVal = driver.findElement(By.xpath(beforeXpath + rowNum + AfterXpath + colNum + "]")).getText();

				} catch (NoSuchElementException e) {
					System.out.println("Please enter correct date");
					flag = false;
					break;
				}
				System.out.println(dayVal);
				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(beforeXpath + rowNum + AfterXpath + colNum + "]")).click();
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}

	}

}
