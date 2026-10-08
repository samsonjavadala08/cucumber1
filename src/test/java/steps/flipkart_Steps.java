package steps;

import actions.Common_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flipkart_Steps {
	
	Common_Actions common_Actions;
	
	public flipkart_Steps(Common_Actions common_Actions) {
	//	System.out.println("flipkart");
		
		this.common_Actions=common_Actions;
		
		
	}
	

@Given("I am on flipkart home page")
public void i_am_on_flipkart_home_page() {
   String url = "https://www.flipkart.com/";
	common_Actions.goToUrl(url);
	common_Actions.Max();
}

@When("I click on login button")
public void i_click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I am navigated to login page")
public void i_am_navigated_to_login_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
