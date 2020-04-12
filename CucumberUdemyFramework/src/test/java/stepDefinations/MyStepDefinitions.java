package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;
	CheckOutPage cp;

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
        driver= Base.getDriver();
   
    	
    }
  

    @When("^User searched for (.+) Vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
        
    	//  //tagname[@attribute='value']
    h=new HomePage(driver);
    h.getSearch().sendKeys(strArg1);
  
    	Thread.sleep(3000);
    	
    }
    

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
   Assert.assertTrue( h.getProductName().getText().contains(strArg1));
    }
   

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
   h.increment().click();
h.addToCart().click();
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
  driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
  driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
  
    }

}