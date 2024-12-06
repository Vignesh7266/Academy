package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListPage {
	WebDriver driver;
	private By Hyplink = By.xpath("//a[text()='Nike']");

	public ProductListPage(WebDriver driver) {
		this.driver = driver;
	}

	public void VerifyUserIsAbleToCheckTrendingSearchesLinksAreClickable() {
		WebElement HyperLink = driver.findElement(Hyplink);
		if (HyperLink.isEnabled()) {
			System.out.println("The Link is Cilckable");
		} else {
			System.out.println("The Link is not Clickable");
		}

	}

}
