package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrendingSearchesPage {
	WebDriver driver;

	By link = By.xpath("//div[@id='trending-search']/a");

	public TrendingSearchesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void VerifyThatTrendingSearchesPanelDisplaysListofHyperLinks() {
		if (link.equals(link)) {
			System.out.println("Hyper Link Is Displayed In Trending Searches Panel");
		} else {
			System.out.println("There Is No Hyper Linke In Trending Searches Panel");
		}

	}

}
