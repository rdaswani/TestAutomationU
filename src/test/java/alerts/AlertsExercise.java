package alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsExercise extends BaseTests {

    public WebDriver driver;

    @Test
    public void contextMenuTests(){
        var contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.clickHotSpotArea();
        String text = contextMenuPage.getResultText();
        contextMenuPage.clickOk();
        assertEquals(text,"You selected a context menu","Test failed incorrect action performed");
        }

}
