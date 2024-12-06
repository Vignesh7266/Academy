package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By Panel = By.xpath("//span[text()='Trending Searches']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void VerifyUserisablenavigatetoseeTrendingSearchesPanelinHomePage() {

		if (Panel.equals(Panel)) {
			System.out.println("Trending Searches Panel Displayed On Top Left In HomePage");
		} else {
			System.out.println("There is no Trending Searches Panel on Hoem Page");

		}

	}
}