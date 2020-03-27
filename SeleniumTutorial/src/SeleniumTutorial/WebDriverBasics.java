package SeleniumTutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\n\\Desktop\\Swapnil\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\Swapnil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// WebDriver driver = new FirefoxDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// driver.get("https://ui.cogmento.com/");
		// driver.manage().window().maximize();

		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 * 
		 * if(title.equals("Google")) {
		 * 
		 * System.out.println("Correct title"); }else
		 * System.out.println("In-correct tile");
		 * 
		 * System.out.println(driver.getCurrentUrl());
		 */

		String title1 = driver.getTitle(); // Wwb page name validation
		System.out.println(title1);

		if (title1.equals("CRM")) {
			System.out.println("correct");
		} else
			System.out.println("Incorrect tile");

		/*
		 * driver.findElement(By.name("email")).sendKeys("Swapnil.bodade88@gmail.com");
		 * 
		 * driver.findElement(By.name("password")).sendKeys("Qwerty@123");
		 * 
		 * driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).
		 * click();
		 */

		// driver.findElement(By.linkText("Forgot your password?")).click();

		driver.findElement(By.name("proceed")).click(); // ALert pop up handle

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		/***********************************************************/
		String text = alert.getText(); // Alert pop text validation

		if (text.equals("Please enter a valid user name")) {

			System.out.println("Correct");
		} else
			System.out.println("incorrect");

		alert.accept();

	}

}
