package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {
	public WebDriver driver = null;

	@BeforeMethod
	public void setup() throws InterruptedException {
//		System.setProperty("Webdriver.edge.driver","C:\\Users\\CA005\\eclipse-workspace\\Academy\\msedgedriver.exe");
//		driver = new EdgeDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.academy.com/");
	}

	@AfterMethod
	public void Browserclose() {
		driver.quit();
	}
}
