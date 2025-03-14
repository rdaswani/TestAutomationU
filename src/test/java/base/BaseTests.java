package base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.beans.EventHandler;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    //private EventFiringDecorator driver = new EventFiringDecorator(new EventReporter()).decorate(new ChromeDriver());
    //private WebDriver driver = new EventFiringDecorator(new EventReporter()).decorate(new ChromeDriver());
    private WebDriver driver;

    //private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver = new ChromeDriver(getChromeOptions());

        //for listening to selenium events
        EventReporter reporter = new EventReporter();
        EventFiringDecorator decorator = new EventFiringDecorator(reporter);
        driver = decorator.decorate(driver);

        goHome();
        deleteCookie();


        homePage = new HomePage(driver);
    }

    @BeforeMethod

    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void takeScreenShotsOnFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){


        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try{
            Files.move(screenshot, new File("src/main/resources/screenshots/"+result.getName()+".png"));
            System.out.println(screenshot.getPath());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        }
    }

    public ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();

        //disable infobars is deprecated
        //options.addArguments("disable-infobars");

        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        //options.setHeadless(true); is now options.addArguments("--headless");
        //options.addArguments("--disable-blink-features=AutomationControlled");


        return options;
    }

    public void deleteCookie(){
        driver.manage().deleteCookieNamed("optimizelyBuckets");

    }

    public Cookie getCookie(){
        return driver.manage().getCookieNamed("optimizelyBuckets");
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    public static void main(String[] args) {
        BaseTests tests = new BaseTests();
        tests.setUp();
    }



}
