package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testExplicitWait extends BaseTests {

    @Test
    public void  explicitWaitTests(){
        var dynamicLoadedPage = homePage.clickDynamicLoadingPageLink().clickExample2();
        dynamicLoadedPage.clickStart();
        assertEquals(dynamicLoadedPage.getLoadedText(),"Hello World!","Incorrect text");
    }


}
