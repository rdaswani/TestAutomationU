package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void clickSliderTests(){
        var sliderPage = homePage.clickHorizontalSliderPage();
        sliderPage.clickSlider();
        assertEquals(sliderPage.getText(), "4");

    }

}
