package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement product_xpath;



    public LandingPage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyProductTitleISAvailable(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(product_xpath));
        product_xpath.isDisplayed();

    }

    public void clickAddToCart(String productName){
        WebElement addToCartButton = driver.findElement(
                By.xpath("//*[@id='add-to-cart-"+productName+"']"));
        addToCartButton.click();
    }




}
