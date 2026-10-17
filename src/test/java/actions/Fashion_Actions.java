package actions;

import org.openqa.selenium.WebDriver;

import elements.Fashion_Elements;
import steps.Common_Steps;

public class Fashion_Actions {
	
	private WebDriver driver;
	
	Fashion_Elements fashionelement;
	public Fashion_Actions(Common_Steps common_Steps) {
		
	this.driver=common_Steps.getDriver();
	 fashionelement= new Fashion_Elements(driver);
		
	}
	
	
	public void clickFashion() {
		//ebayHome_Elements.advancedLink.click();
		fashionelement.FashionLink.click();
	}
	

}
