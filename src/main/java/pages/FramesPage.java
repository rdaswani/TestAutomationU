package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage{

    public WebDriver driver;

    public FramesPage(WebDriver driver){
        this.driver=driver;
    }

    public By nestedFrame = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a");

    public NestedFramePage clickNestedFrame(){
        System.out.println("3");
        driver.findElement(nestedFrame).click();
        System.out.println("4");
        return new NestedFramePage(driver);
    }

}
