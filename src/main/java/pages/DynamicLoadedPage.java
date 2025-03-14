package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadedPage {

    public WebDriver driver;
    public By startButton  = By.cssSelector("#start button");
    public By loadingImg = By.id("loading");
    public By finishText = By.id("finish");


    public DynamicLoadedPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        System.out.println("1");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        System.out.println("2");
        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingImg)));
        //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("finish"),"Hello World!"));
        wait.until(ExpectedConditions.presenceOfElementLocated(finishText));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(finishText)));
        //wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(finishText),"Hello World"));
        System.out.println("3");
    }

    public String getLoadedText(){
        return driver.findElement(finishText).getText();
    }


}
