package CucumberFeature1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdef1
{
	@Given("^user able to open the browser$")
	public void user_able_to_open_the_browser() throws Throwable {
	    System.out.println("open_the_browser");
	    
	}

	@Given("^user able to enter the url$")
	public void user_able_to_enter_the_url() throws Throwable {
		System.out.println("enter_the_url");
	    
	}

	@Given("^user able to enter the username$")
	public void user_able_to_enter_the_username() throws Throwable {
		System.out.println("enter_the_username");

	    
	}

	@Given("^user able to enter the password$")
	public void user_able_to_enter_the_password() throws Throwable {
		System.out.println("enter_the_password");

	    
	}

	@Then("^user able to click on the login$")
	public void user_able_to_click_on_the_login() throws Throwable {
		System.out.println("click_on_the_login");
	    
	}

	@Then("^user able to login successfully$")
	public void user_able_to_login_successfully() throws Throwable {
		System.out.println("login_successfully");	    
	}

}
