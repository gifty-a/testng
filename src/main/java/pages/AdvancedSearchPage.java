package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvancedSearchPage {
    private WebDriver webDriver;
    private By logo = By.id("gh-la");
    private By searchField = By.xpath("//input[@id='_nkw']");
    private By submitBtn = By.xpath("(//*[@class='btn btn-prim'])[1]");
//    public WebElement dropDownElements = webDriver.findElement(By.id("e1-1"));
//    public List<WebElement> dropDownElements = webDriver.findElements(By.cssSelector("select#e1-1>option"));
    public AdvancedSearchPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
//    public String getCurrentUr(){
//        return webDriver.getCurrentUrl();
//    }
//    public List<String> getOriginalOptionsOrder(){
//        List<String> dropDownOptionsTextArr = new ArrayList<String>();
//        for (WebElement el : dropDownElements){
//            dropDownOptionsTextArr.add(el.getText());
//        }
//        System.out.println(dropDownOptionsTextArr);
//        return dropDownOptionsTextArr;
//    }
//    public List<String> getSortedOptionsOrder(){
//        List<String> sortedArray = new ArrayList<String>(this.getOriginalOptionsOrder());
//        Collections.sort(sortedArray);
//        System.out.println(sortedArray);
//        return sortedArray;
//    }
    public HomePage goHomeViaLogo(){
        webDriver.findElement(logo).click();
        return new HomePage(webDriver);
    }
    public ResultsPage searchForItem(String text1, String text2){
        webDriver.findElement(searchField).sendKeys(text1 + " " + text2);
        webDriver.findElement(submitBtn).click();
        return new ResultsPage(webDriver);
    }

}
