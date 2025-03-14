package alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FIleUploadTests extends BaseTests {
    public WebDriver driver;

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUploadPage();
        uploadPage.clickChooseFileButton("C:/Users/RajeshDaswani/Downloads/FileUploadTest.txt");
        uploadPage.clickUploadFileButton();
        assertEquals(uploadPage.getConfText(),"FileUploadTest.txt","Uploaded files incorrect");
    }

}
