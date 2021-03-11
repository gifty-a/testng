package advanced_search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AdvancedSearchPage;

import static org.testng.Assert.assertEquals;


public class AdvancedSearchPageTests extends BaseTests {
    @Test
    public void checkCategoryOrdering(){
        AdvancedSearchPage advancedSearchPage = homePage.goToAdvancedSearchPage();
//        assertEquals(advancedSearchPage.getCurrentUr(),"https://www.ebay.com/sch/ebayadvsearch");
        System.out.println(advancedSearchPage.dropDownElements);
//        advancedSearchPage.getOriginalOptionsOrder();
//        advancedSearchPage.getSortedOptionsOrder();
    }

}
