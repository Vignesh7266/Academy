package Test;

import org.testng.annotations.Test;
import Pages.Basepage;
import Pages.ProductListPage;
import Pages.ProductListPage_1;
import Pages.SignInPage;
import Pages.TrendingSearchesPage;
import Pages.HomePage;

public class BaseTest extends Basepage {

	@Test
	public void ValidateBasetest() throws InterruptedException {
//		Basepage basepage = new Basepage();
//		basepage.setup();

	/*	HomePage trendingseasrches = new HomePage(driver);
		trendingseasrches.VerifyUserisablenavigatetoseeTrendingSearchesPanelinHomePage();

		TrendingSearchesPage trsrc_hyperlinks = new TrendingSearchesPage(driver);
		trsrc_hyperlinks.VerifyThatTrendingSearchesPanelDisplaysListofHyperLinks();

		ProductListPage hyperlinks = new ProductListPage(driver);
		hyperlinks.VerifyUserIsAbleToCheckTrendingSearchesLinksAreClickable();

		ProductListPage_1 HyperLink = new ProductListPage_1(driver);
		HyperLink.VerifyPageShouldLoadRelatedBySelectedHyperLinkInTrendingSearches();
	*/
		SignInPage signinpage = new SignInPage(driver);
		signinpage.UserIsAbleToClickOnSignInButton();
	}
}