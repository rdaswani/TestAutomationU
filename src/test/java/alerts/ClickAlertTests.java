package alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ClickAlertTests extends BaseTests {
    public WebDriver driver;

    @Test
    public void clickJSAlert(){
        var alertsPage =  homePage.clickAlertPage();
        alertsPage.alert_clickAlert();
        alertsPage.clickOk();
        assertEquals(alertsPage.getAlertText(),"You successfully clicked an alert","Incorrect alert");

    }

    @Test
    public void clickJSConfirm(){
        var alertsPage =  homePage.clickAlertPage();
        alertsPage.alert_clickConfirm();
        alertsPage.clickDismiss();
        assertEquals(alertsPage.getConfirmText(),"You clicked: Cancel","Incorrect alert");

    }

    @Test
    public void clickJSPrompt(){
        var alertsPage =  homePage.clickAlertPage();
        alertsPage.alert_clickPrompt();
        String text = "Radhe Radhe";
        alertsPage.enterPrompt(text);
        alertsPage.clickOk();
        assertEquals(alertsPage.getPromptText(),"You entered: "+text,"Incorrect alert");

    }
}
