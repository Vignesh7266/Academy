package StepDefination;

import PageObejets.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Product_page_StepDefinition {
    ProductPage productpage = new ProductPage();

    @Given("i navigate to academy page")
    public void i_navigate_to_academy_page() {
        productpage.launchapplication();
    }
    @Given("i search {string} in searchbar")
    public void i_search_in_searchbar(String productname) throws InterruptedException {
        productpage.searchproduct(productname);
    }
    @Then("i able to see search related product")
    public void i_able_to_see_search_related_product(String URL) {
        productpage.Verifyproductisrelatedbysearch(URL);

    }
    @Then("i close and quit the browser")
    public void i_close_and_quit_the_browser() {
        productpage.closebrowser();
    }

}
