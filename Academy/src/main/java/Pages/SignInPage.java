package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	WebDriver driver;
	
	
	By SIGNIN = By.xpath("//button[contains( @aria-label ,'Sign In')]");
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

		public void UserIsAbleToClickOnSignInButton() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(SIGNIN).click();
			Thread.sleep(2000);
		}
	
}
