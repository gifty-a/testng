package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver webDriver;
    private By searchBtn = By.id("gh-btn");
    private By advancedSearchLink = (By.linkText("Advanced"));
    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void clickSearchButton(){
        webDriver.findElement(searchBtn).click();
    }
    public String getUrl(){
        System.out.println(webDriver.getCurrentUrl());
        return webDriver.getCurrentUrl();
    }
    public String getPageTitle(){
        System.out.println(webDriver.getTitle());
        return webDriver.getTitle();
    }
    public AdvancedSearchPage goToAdvancedSearchPage(){
        clickLink(advancedSearchLink);
        return new AdvancedSearchPage(webDriver);
    }
    private void clickLink(By linkText){
        webDriver.findElement(linkText).click();
    }
}
