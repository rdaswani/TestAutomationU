package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    public WebDriver driver;
    public By dropdownLocater = By.id("dropdown");
    public DropdownPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickDropdown(){
        WebElement webElement = driver.findElement(dropdownLocater);
        var javascriptExecutor = (JavascriptExecutor)driver;
        String script = "document.querySelector('#dropdown').setAttribute('multiple','')";
        javascriptExecutor.executeScript(script);
    }

    public void selectDropdownOptions(){

            Select dropdownElement =  new Select(driver.findElement(dropdownLocater));
            dropdownElement.selectByIndex(1);
            dropdownElement.selectByIndex(2);
        }


    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdownLocater));
    }

}
