package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickForgotPassword();
        getWindowManager().goBack();
        getWindowManager().goToURL();

    }

    @Test
    public void testDynamicPageNavigations(){
        var dynamicPage = homePage.clickDynamicLoadingPageLink();
        dynamicPage.clickExample1();
        //dynamicPage.openExample2InANewPage();
        dynamicPage.switchToNewTab();
        assertEquals(String.valueOf(dynamicPage.isStartButtonAvailable()), "true", "test failed");


    }
}
