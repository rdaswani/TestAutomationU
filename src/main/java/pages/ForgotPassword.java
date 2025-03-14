package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
    public WebDriver driver;
    public WebElement webElement;
    private By emailId = By.id("email");


    public ForgotPassword(WebDriver driver){
        this.driver=driver;
    }

    public void setEmailID(String email){
        driver.findElement(By.id("email")).sendKeys(email);


    }


    public String clickRetrievePassword(){

        driver.get("https://the-internet.herokuapp.com/email_sent");
        String test = driver.findElement(By.id("content")).getText();

        return test;
    }



}
