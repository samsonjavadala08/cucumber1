package steps;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.Common_Actions;
import actions.Fashion_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flipkart_Steps {
	
	Common_Actions common_Actions;
	Fashion_Actions fashion_Actions;
	WebDriver driver;	
	public flipkart_Steps(Common_Actions common_Actions,Fashion_Actions fashion_Actions,Common_Steps common_Steps) {
	//	System.out.println("flipkart");
		
		this.common_Actions=common_Actions;
		this.fashion_Actions=fashion_Actions;
		this.driver=common_Steps.getDriver();;
		
	}
	

@Given("I am on flipkart home page")
public void i_am_on_flipkart_home_page() throws InterruptedException, TimeoutException {
   String url = "https://www.flipkart.com/";
	common_Actions.goToUrl(url);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement closeBtn = wait.until(
	    ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='button']"))
	);
	closeBtn.click();  // dismiss the popup
	common_Actions.Max();
	Thread.sleep(5000);
}

@When("I click on Fashion link")
public void i_click_on_fashion_link() {
	//fashion_Actions.clickOnFashionLink();
	fashion_Actions.clickFashion();
}

@Then("I am navigated to login page")
public void i_am_navigated_to_login_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
