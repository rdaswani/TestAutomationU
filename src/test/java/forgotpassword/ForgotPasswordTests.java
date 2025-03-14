package forgotpassword;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPassword;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    public WebDriver driver;

    @Test
    public void forgotPassword(){
        ForgotPassword forgotPassword = homePage.clickForgotPassword();
        forgotPassword.setEmailID("raj@gmail.com");
        forgotPassword.clickRetrievePassword();
        forgotPassword.clickRetrievePassword();
        //System.out.println("text is "+forgotPassword.clickRetrievePassword());
        assertTrue(forgotPassword.clickRetrievePassword().contains("Your e-mail's been sent!"),"Alert incorrect login credentials");



    }



}
