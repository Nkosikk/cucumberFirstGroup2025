package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDefination extends Base {


    @Given("I am  in the login page")
    public void i_am_in_the_login_page() throws InterruptedException {

    }

    @And("I enter the username (.*)$")
    public void i_enter_the_username_username(String username) {
        loginPage.enterUsername(username);
    }

    @And("I enter the password (.*)$")
    public void i_enter_the_password_password(String password) {
        loginPage.enterPassword(password);
        takesScreenshot.takesScreenshot(driver,"1. User Credentials Entered");
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();

    }

    @Then("Landing page is displayed")
    public void landingPageIsDisplayed() {
        landingPage.verifyProductTitleISAvailable();
        takesScreenshot.takesScreenshot(driver,"2. Landing Page");
    }

    @And("I select the cart")
    public void iSelectTheCart() {
    }

    @And("I click on the (.*)$")
    public void i_click_on_the_product(String productName) {
        addToCartPage.clickProduct(productName);
        takesScreenshot.takesScreenshot(driver,"3. "+productName +" Selected");
    }

    @Then("I verify the (.*) details$")
    public void i_verify_the_details(String product) {
        boolean product_match = addToCartPage.verifyProductPage(product);
        if( product_match ){
            takesScreenshot.takesScreenshot(driver,"4. "+product+" Details Verified and added to cart");
        }else{
            takesScreenshot.takesScreenshot(driver,"4. "+product+" Details Verified and Does Not Match");
        }

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
