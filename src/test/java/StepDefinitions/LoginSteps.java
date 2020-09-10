package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class LoginSteps {
	
	
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() {
			System.out.println("clicks on login button");
	}

	@Then("^User logged in successful$")
	public void user_logged_in_successful() {
	   System.out.println("User logged in successful");
	}

	@When("^user enters naresh and naresh123$")
	public void user_enters_naresh_and_naresh123() {
	 System.out.println("user enters naresh and naresh123");
	}

}
