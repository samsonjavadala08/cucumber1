package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fashion_Elements {
	
	WebDriver driver;
	
	public Fashion_Elements(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//public WebElement FashionLink=driver.findElement(By.xpath("//h1[contains(text(),'Fashion')]"));
	
	//@FindBy(By.xpath("")) public WebElement FashionLink;
	
	@FindBy(xpath="//div[contains(text(),'Fashion')]") public WebElement FashionLink;
}
