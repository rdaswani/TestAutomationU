package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    //private By formAuthenticationLink = By.linkText("Form Authentication");
    //locally declared in method

    private WebDriver driver;


    public LoginPage clickFormAuthentication(){
        //driver.findElement(formAuthenticationLink).click();
        //Using the method now as the action is going to be repeated each and everytime for all links
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderPage(){
        clickLink("Horizontal Slider");
        return  new HorizontalSliderPage(driver);
    }

    public AlertsPage clickAlertPage(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public FramesPage clickOnFramesLink(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPageLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public DropdownPage clickDropdownPageLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
