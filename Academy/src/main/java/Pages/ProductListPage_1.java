package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage_1 {
	WebDriver driver;
	By Link = By.linkText("Crocs");

	public ProductListPage_1(WebDriver driver) {
		this.driver = driver;
	}

	public void VerifyPageShouldLoadRelatedBySelectedHyperLinkInTrendingSearches() throws InterruptedException {
		driver.findElement(Link).click();
		String expectedUrl = "https://www.academy.com/search?searchTerm=crocs&icid=hp_ts_searchterm_crocs";
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Hyperlink Clikced Successfully");
		} else {
			System.out.println("Hyperlink is Not Clicked Successfully");

//			Thread.sleep(2000);
		//	driver.quit();
			//driver.close();

		}

	}
}
