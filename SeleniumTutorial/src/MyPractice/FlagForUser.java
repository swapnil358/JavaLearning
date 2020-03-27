package MyPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlagForUser {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\Swapnil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//
//		driver.get("https://classic.crmpro.com/index.html");
//		driver.findElement(By.name("username")).sendKeys("swapnilautomation");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.switchTo().frame("mainpanel");
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Tasks')]")).click();
//		Thread.sleep(1000);
//		
//		WebElement element = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td[9]/i"));
//		element.click();
//		
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String ParentWindowId = it.next();
		System.out.println("ParentWindowId"+" "+ParentWindowId);
		
		Thread.sleep(1000);
		
		String ChildWindowID = it.next();
		System.out.println("ChildWindowId"+" "+ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		System.out.println("childwinTitle"+" "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("gaurav.2n@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		driver.switchTo().window(ChildWindowID).close();
		
		driver.switchTo().window(ParentWindowId);
		System.out.println("ParentwinTitle"+" "+driver.getTitle());
		
		driver.close();
		
		
		/*
		 * 
		 * Using alert
		 */
		
//		Alert alert = driver.switchTo().alert();
//		
//		alert.getText();
//		
//		System.out.println("Pop up name" + alert.getText());
//		
		
		
	}

}
