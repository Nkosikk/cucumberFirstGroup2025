package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverWiewPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkOutOverView_xpath;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    WebElement itemTotal_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")
    WebElement Tax_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
    WebElement Total_xpath;


    public CheckoutOverWiewPage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyItemTotalPlusTaxIsEqualTotal() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkOutOverView_xpath));

        // Resolve Item Total

        String itermTotalText = itemTotal_xpath.getText();

        String itemTotalExtracted = itermTotalText.replace("Item total: $", "");

        float itermTotal = Float.parseFloat(itemTotalExtracted);


//        float itemTotalPlusText =


        // Resolve Tax
        String TaxText = Tax_xpath.getText();

        String TaxExtracted = TaxText.replace("Tax: $", "");

        float Tax = Float.parseFloat(TaxExtracted);


        // Resolve Total
        String TotalText = Total_xpath.getText();

        String totalTextExtracted = TotalText.replace("Total: $", "");

        float Total = Float.parseFloat(totalTextExtracted);


        // Calculate item total plus tax

        float itemTotalPlusTax = itermTotal + Tax;

        // check if item, total plus tax is the same

        if (itemTotalPlusTax == Total) {
            System.out.println("The calculation are correct");
            assert true;
            // put the code to click finish button
        } else {
            // do the code to click cancel
            System.out.println("The calculation are not correct");
            assert false;
        }

        // put the logout code here


    }


}
