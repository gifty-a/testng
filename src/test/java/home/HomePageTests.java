package home;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;


public class HomePageTests extends BaseTests {
    // hard assertion
    @Test
    public void empty_search_test(){
        homePage.clickSearchButton();
        assertEquals(homePage.getUrl(),"https://www.ebay.com/n/all-categories", "Verify page URL");
        assertEquals(homePage.getPageTitle(),"Shop by Category | eBay", "Verify page title");
    }
    // soft assertion
    @Test
    public void empty_soft_assertion(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }
}
