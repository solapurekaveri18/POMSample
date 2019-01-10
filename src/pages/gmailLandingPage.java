package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailLandingPage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@aria-label='Search mail']")
	WebElement landingPage;

	public gmailLandingPage(WebDriver driver) {
		
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}

		public WebElement search() {
		return landingPage;
	}

}
