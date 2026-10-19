package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionPage {
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page()
	{
		System.out.println("user is on the login page");
	}
	
	@When("user enters userName {string}")
	public void user_enters_userName(String user)
	{
		System.out.println("user enters userName"+user);
	}
	

	@When("user enters password {string}")
	public void user_enters_password(String pass) {
	    System.out.println("user enters password: " + pass);
	}
	
	@And("user click login button")
	public void user_click_login_button()
	{
		System.out.println("user click login button");
	}
	
	@Then("user is moved to DashBoard")
	public void user_is_moved_to_DashBoard()
	{
		System.out.println("user is moved to DashBoard");
	}
	
	
	
	

	
	

}
