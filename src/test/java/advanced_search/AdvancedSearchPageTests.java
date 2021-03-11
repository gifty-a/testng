package advanced_search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AdvancedSearchPage;

import java.util.Locale;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AdvancedSearchPageTests extends BaseTests {

    @Test
    public void checkCategoryOrdering(){
        AdvancedSearchPage advancedSearchPage = homePage.goToAdvancedSearchPage();
//        assertEquals(advancedSearchPage.getCurrentUr(),"https://www.ebay.com/sch/ebayadvsearch");
//        System.out.println(advancedSearchPage.dropDownElements);
//        advancedSearchPage.getOriginalOptionsOrder();
//        advancedSearchPage.getSortedOptionsOrder();
    }
//    @Test
//    public void searchForItem(){
//        AdvancedSearchPage advancedSearchPage = homePage.goToAdvancedSearchPage();
//        advancedSearchPage.searchForItem(keyword1, keyword2);
//        assertTrue(advancedSearchPage.getHeadingText().toLowerCase().contains(keyword1), "Result title contains keyword" + keyword1);
//        assertTrue(advancedSearchPage.getHeadingText().toLowerCase().contains(keyword2), "Result title contains keyword" + keyword2);
//    }

}
