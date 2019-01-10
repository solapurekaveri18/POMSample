package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.gmailLandingPage;
import pages.gmailLoginPage;

public class gmailLoginTC {

	@Test
	public void Login() throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver ();
		driver.get("https://www.gmail.com");
		
		gmailLoginPage login = new gmailLoginPage (driver);
		
		login.Emaild().sendKeys("test123@gmail.com");
		login.clickNext().click();
		Thread.sleep(1000);
		login.Password().sendKeys("DummyPass");
		login.clickNext().click();
		Thread.sleep(5000);
		
		gmailLandingPage home = new gmailLandingPage (driver);
		home.search().sendKeys("Test");
		Thread.sleep(5000);
		
		System.out.println("Gmail Inbox page appeared:");
		
	}
}
