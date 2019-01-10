package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailLoginPage {

	WebDriver driver;
	@FindBy(xpath="//*[@id='identifierId']")
	WebElement email;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	public gmailLoginPage(WebDriver driver) {
			this.driver = driver;
			//This initElements method will create  all WebElements
			PageFactory.initElements(driver, this);
	}
		
		
	//get email id in textbox
	public WebElement Emaild(){
		return email;
	}
	
	//get password in password textbox
	public WebElement Password(){
		return password;
	}
	
	//Click on next button
	public WebElement clickNext(){
		return nextButton;
	}
	
}


//By email = By.xpath("//*[@id='identifierId']");
//By nextButton = By.xpath("//span[text()='Next']");	
//By password = By.xpath("//input[@name='password']");
//