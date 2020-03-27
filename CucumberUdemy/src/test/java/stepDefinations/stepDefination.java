package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^User is not netbanking login page$")
	public void user_is_not_netbanking_login_page() throws Throwable {
		System.out.println("User is navigated to login page");
	}
	
	@Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("browser validated");
    }

    @When("^browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("browser triggered");
        
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("browser started");
    }
	

	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		System.out.println(arg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Navigated to home page");
	}

	@And("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);

	}

	@When("^User sign up$")
	public void user_sign_up(DataTable data) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		List<List<String>> obj = data.raw();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));

	}

	@When("^User login in to application with user(\\d+) and pass(\\d+)$")
	public void user_login_in_to_application_with_user_and_pass(String username, String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(username);
		System.out.println(password);

	}

}