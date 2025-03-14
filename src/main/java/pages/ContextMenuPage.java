package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    public WebDriver driver;
    public By hotspotArea = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickHotSpotArea(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(hotspotArea);
        actions.contextClick(element);
        actions.perform();

    }

    public String getResultText(){

        return driver.switchTo().alert().getText();

    }
    public void clickOk(){
        driver.switchTo().alert().accept();
    }
}
