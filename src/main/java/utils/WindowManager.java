package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    public WebDriver driver;
    private final WebDriver.Navigation navigate;



    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }
    public void goToURL(){
        navigate.to("https://www.google.com");
    }
}
