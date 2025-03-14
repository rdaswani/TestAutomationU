package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    public WebDriver driver;
    public By example2 = By.xpath("//*[@id='content']/div/a[2]");
    public By example1 = By.xpath("//*[@id='content']/div/a[1]");
    public  By startButton = By.cssSelector("#start button");

    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }
    public DynamicLoadedPage clickExample1(){
        driver.findElement(example1).click();
        return new DynamicLoadedPage(driver);
    }

    public DynamicLoadedPage clickExample2(){
        driver.findElement(example2).click();
        return new DynamicLoadedPage(driver);
    }

    public DynamicLoadedPage openExample2InANewPage(){
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .click(driver.findElement(example2))
                .keyUp(Keys.CONTROL)
                .perform();
        return new DynamicLoadedPage(driver);
    }

    public void switchToNewTab(){
        var tabs = driver.getWindowHandles();
        System.out.println("Number of open tabs are : "+tabs.size());
        tabs.forEach(System.out::println);
        for(String window : tabs){
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/dynamic_loading/2")){
                System.out.println("super");
                isStartButtonAvailable();
            }

        }
    }

    public boolean isStartButtonAvailable(){
        boolean isStartDisplayed =  driver.findElement(startButton).isDisplayed();
        return isStartDisplayed;
    }
}
