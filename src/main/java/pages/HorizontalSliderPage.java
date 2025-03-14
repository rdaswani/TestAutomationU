package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import javax.swing.*;

public class HorizontalSliderPage {

    public WebDriver driver;
    private WebElement slider;

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;

    }

    public WebElement getSlider(){
        return driver.findElement(By.tagName("input"));
    }
    public String getText(){
        WebElement id = driver.findElement(By.id("range"));
        String text = id.getText();
        return text;
    }
//    public By slider = By.id("range");


  //  WebElement slider = driver.findElement(By.id("range"));



    public void clickSlider(){

        getSlider().click();
        getSlider().sendKeys(Keys.ARROW_RIGHT);
        getSlider().sendKeys(Keys.ARROW_RIGHT);
       // getSlider().sendKeys(Keys.ARROW_RIGHT);

    }



}
