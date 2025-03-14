package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    public WebDriver driver;
    private By confirmationText = By.id("content");


    public EmailSentPage(WebDriver driver){
        this.driver=driver;
    }

    public String getconfirmationText(){
        return driver.findElement(By.id("content")).getText();
    }

}
