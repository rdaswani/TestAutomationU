package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramePage {

    public WebDriver driver;

    public By leftFrameText = By.tagName("body");
    //public By leftFrameText = By.tagName("body");
    public  By leftFrameName = By.cssSelector("html > frameset > frame:nth-child(1)");
    //public  By bottomFrameName = By.cssSelector("html > frame[name='frame-bottom']");
    //public  By bottomFrameName = By.xpath("/html/frameset/frame[2]");
    //public  By leftFrameName = By.xpath("/html/frameset/frame[1]");

    public NestedFramePage(WebDriver driver){
        this.driver=driver;
    }
    public void switchToParentFrame(){
        System.out.println("Entering switch parent");
        driver.switchTo().parentFrame();
    }

    public void clickLeftFrame(){
        System.out.println("2");
        //switchToParentFrame();
        driver.findElement(leftFrameName).click();
    }

    public void switchToLeftFrame(){
        System.out.println("11");
        //switchToParentFrame();
        WebElement leftFrameWebElement = driver.findElement(leftFrameName);
        driver.switchTo().frame(leftFrameWebElement);
        //driver.switchTo().frame("frame-bottom");
    }

    public String getLeftFrameText(){
        //switchToParentFrame();
        switchToLeftFrame();
        //System.out.println(driver.findElement(leftFrameText));
        return  driver.findElement(leftFrameText).getText();
    }

    public void switchToBottomFrame(){
        System.out.println("entering bottom frame switch method");
        switchToParentFrame();
        System.out.println("After ");
        //WebElement bottomFrameWebElement = driver.findElement(bottomFrameName);
        //driver.switchTo().frame(bottomFrameWebElement);
        driver.switchTo().frame("frame-bottom");
    }

    public String getBottomFrameText(){
        System.out.println("entering getbottom frame text");
        switchToBottomFrame();
        return  driver.findElement(leftFrameText).getText();
    }



}
