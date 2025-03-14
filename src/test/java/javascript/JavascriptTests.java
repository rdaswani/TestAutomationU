package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavascriptTests extends BaseTests {

    @Test
    public void clickDropDownTest(){
        var dropdownPage = homePage.clickDropdownPageLink();
        dropdownPage.clickDropdown();
        dropdownPage.selectDropdownOptions();
        assertEquals(dropdownPage.getSelectedOptions().get(0),"Option 1", "incorrect value");
        assertEquals(dropdownPage.getSelectedOptions().get(1),"Option 2", "incorrect value");

    }

}
