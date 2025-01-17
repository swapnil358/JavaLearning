package SeleniumTutorial;

//https://youtu.be/Dpx1Q62QpFU?list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	// refer - https://youtu.be/PGPlL0zP7Ik?list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\n\\Desktop\\Swapnil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("test@1223");

		WebElement lgnBttn = driver.findElement(By.xpath("//input[@type='submit']"));
		// WebElement ip =
		// driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img"));

		// flash the button
		flash(lgnBttn, driver);

		// To draw border
		drawBorder(lgnBttn, driver);

		// generateAlert("there is an error with login button", driver);

		// Click on element by Java Script executor
		ClickElementByJS(lgnBttn, driver);

		// Refresh by selenium
		driver.navigate().refresh();

		// Refresh by JS
		refreshByJS(driver);

		// To get title by JS
		System.out.println(getTitlebyJS(driver));

		// To get the page text by JS
		System.out.println(getPageInnerTextByJS(driver));

		// Scroll page down
		scrollpageDown(driver);
		
		//To scroll down till forgot password visible
		WebElement forgotpwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		scrollToView(forgotpwdLink, driver);

		// TO take a screenshot
		// File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, new
		// File("/Users/n/eclipse-workspace/WebDriverPracticeByNaveen/SeleniumTutorial/src/SeleniumTutorial/google.jpg"));
	}

	public static void flash(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);

	}

	public static void generateAlert(String message, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void ClickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	public static void refreshByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	public static String getTitlebyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	

	public static String getPageInnerTextByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pagetext = js.executeScript("return document.documentElement.innerText").toString();
		return pagetext;
	}

	public static void scrollpageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollToView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
}
