package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    public WebDriver driver;
    public By chooseFileButton = By.id("file-upload");
    public By uploadButton = By.id("file-submit");
    public By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickChooseFileButton(String path){
        driver.findElement(chooseFileButton).sendKeys(path);
    }

    public void clickUploadFileButton(){
        driver.findElement(uploadButton).click();
    }

    public String getConfText(){
       return  driver.findElement(uploadedFile).getText();
    }




}
