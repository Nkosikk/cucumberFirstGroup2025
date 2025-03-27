package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class UserInformationPage {

    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstName_xpath;
    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement zipCode_id;


    public UserInformationPage(WebDriver driver){
        this.driver=driver;
    }


    public void enterFirstName(String firstName){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_xpath));
        firstName_xpath.sendKeys(firstName);

    }
    public void enterLastName(String lastName){

       lastName_id.sendKeys(lastName);

    }
    public void enterZipCode(String zipCode){

        zipCode_id.sendKeys(zipCode);

    }


}
