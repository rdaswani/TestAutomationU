package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    public WebDriver driver;
    public By triggerAlertButtonJSAlert = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    public By triggerAlertButtonJSConfirm = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    public By triggerAlertButtonJSPrompt = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    public By alertText = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }

    public void alert_clickAlert(){
        driver.findElement(triggerAlertButtonJSAlert).click();
    }

    public void alert_clickConfirm(){
        driver.findElement(triggerAlertButtonJSConfirm).click();
    }

    public void alert_clickPrompt(){
        driver.findElement(triggerAlertButtonJSPrompt).click();
    }

    public void clickOk(){
        driver.switchTo().alert().accept();
    }

    public void clickDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void enterPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getAlertText(){
        return driver.findElement(alertText).getText();
    }

    public String getConfirmText(){
        return  driver.findElement(By.id("result")).getText();

    }

    public String getPromptText(){
        return  driver.findElement(By.id("result")).getText();

    }
}
