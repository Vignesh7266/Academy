package PageObejets;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ProductPage {
    WebDriver driver;

    By searchbar = By.xpath("//input[@class='desktop-searchBar']");
    By searchbtn = By.xpath("//a[@class='desktop-submit']");


    public void launchapplication(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=EAIaIQobChMI4Njj-fnuhwMVJSyDAx0mGhjPEAAYASAAEgK8vfD_BwE");
        System.out.println(driver.getTitle());

    }
    public void searchproduct(String text) throws InterruptedException {
        WebElement SearchBox =  driver.findElement(searchbar);
        SearchBox.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(searchbar).sendKeys(text);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(searchbtn).click();
    }

    public void Verifyproductisrelatedbysearch(String text){
        String ExpectedURL = text;
        String ActualURL = driver.getCurrentUrl();
        if (ActualURL.equals(ExpectedURL)){
            System.out.println("Products Data will be displayed as searched in search bar");
        }else {
            System.out.println("Products Data will not be displayed as searched in search bar");
        }

    }

    public void closebrowser(){
        driver.close();
        driver.quit();
    }
}
