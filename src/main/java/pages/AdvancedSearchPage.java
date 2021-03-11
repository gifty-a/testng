package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdvancedSearchPage {
    private WebDriver webDriver;
//    public WebElement dropDownElements = webDriver.findElement(By.id("e1-1"));
    public List<WebElement> dropDownElements = webDriver.findElements(By.cssSelector("select#e1-1>option"));
    public AdvancedSearchPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public String getCurrentUr(){
        return webDriver.getCurrentUrl();
    }
    public List<String> getOriginalOptionsOrder(){
        List<String> dropDownOptionsTextArr = new ArrayList<String>();
        for (WebElement el : dropDownElements){
            dropDownOptionsTextArr.add(el.getText());
        }
        System.out.println(dropDownOptionsTextArr);
        return dropDownOptionsTextArr;
    }
    public List<String> getSortedOptionsOrder(){
        List<String> sortedArray = new ArrayList<String>(this.getOriginalOptionsOrder());
        Collections.sort(sortedArray);
        System.out.println(sortedArray);
        return sortedArray;
    }
}
