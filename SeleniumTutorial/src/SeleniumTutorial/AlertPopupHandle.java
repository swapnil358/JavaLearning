package SeleniumTutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {
	
	
	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Desktop\\Swapnil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.getText();
		
		System.out.println(alert.getText());
		//alert.accept();    //click on OK button
		
		if (alert.getText().equals("Please enter a valid user name")) {
			System.out.println("passed");
		}else
			System.out.println("failed");
		
		Thread.sleep(5000);
		
		alert.accept();		//To click on ok button
		//alert.dismiss();   //TO click on cancel button
		
		
	}
	
}
