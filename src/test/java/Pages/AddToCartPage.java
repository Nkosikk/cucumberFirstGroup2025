package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AddToCartPage {
    WebDriver driver;

    WebElement productName_xpath;

    @FindBy(xpath = "//div[@data-test='inventory-item-name']")
    WebElement product_item_name_xpath;

    @FindBy(id = "add-to-cart")
    WebElement add_to_cart_button_id;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProduct(String productName) {
        productName_xpath = driver.findElement(By.xpath("//div[text()='" + productName + "']"));
        productName_xpath.click();
    }

    public Boolean verifyProductPage(String productName) {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(product_item_name_xpath));

        String productName_onProductPage = product_item_name_xpath.getText();
        System.out.println("Product Name on Product Page: "+productName_onProductPage);

        if (productName_onProductPage.equalsIgnoreCase(productName)) {
            Assert.assertTrue(true, "Product Name is matching");
            add_to_cart_button_id.click();
            return true;
        } else {
            Assert.assertFalse(false, "Product Name is not matching");
            return false;
        }

    }

}

