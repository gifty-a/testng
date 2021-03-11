package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    private WebDriver webDriver;
    protected HomePage homePage;
    private String url = "https://www.ebay.com/";
    @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        webDriver = new ChromeDriver();
    }
    @BeforeMethod
    public void visitHomePage(){
        webDriver.get(url);
        homePage = new HomePage(webDriver);
    }
//    @AfterClass
//    public void close(){
//        webDriver.quit();
//    }

}
