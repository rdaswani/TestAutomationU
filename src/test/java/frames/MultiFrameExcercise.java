package frames;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultiFrameExcercise extends BaseTests {

    public WebDriver driver;

    @Test
    public void clickLeftFrameTest(){
        var framePage = homePage.clickOnFramesLink();
        System.out.println("Passed 1");
        var nestedFramePage = framePage.clickNestedFrame();
        System.out.println("Passed 2");
        nestedFramePage.switchToParentFrame();
        nestedFramePage.switchToLeftFrame();
        System.out.println("Passed 3");
        nestedFramePage.clickLeftFrame();
        System.out.println("Passed 4");
        String text = nestedFramePage.getLeftFrameText();
        System.out.println("Passed 5");
        System.out.println(text);
        assertEquals(text,"LEFT", "incorrect frame");
        System.out.println("Passed 6");
        nestedFramePage.switchToParentFrame();
        nestedFramePage.switchToBottomFrame();
        String text1 = nestedFramePage.getBottomFrameText();
        System.out.println(text1);
        assertEquals(text1,"BOTTOM", "incorrect frame");


    }

}
