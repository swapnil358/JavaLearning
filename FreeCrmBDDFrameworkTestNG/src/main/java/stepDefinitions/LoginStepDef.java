package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDef {
	
	WebDriver driver;
	
	
	@Given("^user already on login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n\\Drivers&Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");

	}

	@When("^title of the page is FreeCRM$")
	public void title_of_the_page_is_FreeCRM() {
		String title = driver.getTitle();
		System.out.println(title);
		try {
			Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.",
					title);
		} catch (Exception e) {
			System.out.println("no need to compare");
		}

	}

	@Then("^user enters username and password on login page$")
	public void user_enters_username_and_password_on_login_page() {
		driver.findElement(By.name("username")).sendKeys("swapnilautomation");
		driver.findElement(By.name("password")).sendKeys("test@123");
	}

	@Then("^user clicks on login button on login page$")
	public void user_clicks_on_login_button_on_login_page() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("^user navigate to home page$")
	public void user_navigate_to_home_page() {
		String homePageTitle = driver.findElement(By.xpath("//td[contains(text(), 'CRMPRO')]")).getText();
		// Assert.assertEquals("CRMPRO", homePageTitle);
		Assert.assertEquals("CRMPRO", homePageTitle);
	}

	
	
}
