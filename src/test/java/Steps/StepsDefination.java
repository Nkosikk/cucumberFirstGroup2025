package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDefination extends Base{


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

    }
    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();

    }

    @Then("Landing page is displayed")
    public void landingPageIsDisplayed() {
        landingPage.verifyProductTitleISAvailable();

    }
    @Then("I add item to cart")
    public void I_add_item_to_cart() {
        landingPage.AddProductToCart();
    }
    @And("I click on the cart button")
    public void i_click_on_the_cart_button() {
        landingPage.clickCartButton();
    }

    @Then("Cart page is displayed")
    public void Cart_page_is_displayed() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();

    }

    @And("I click on the checkout button")
    public void i_click_on_the_checkout_button() {
        driver.findElement(By.id("checkout")).click();
    }

    @Then("Checkout page is displayed")
    public void Checkout_page_is_displayed() {
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).isDisplayed();}

    @And("I enter the name(.*)$")
    public void i_enter_the_name_name(String name) {
        driver.findElement(By.id("first-name")).sendKeys(name);

    }

    @And("I enter the lastname(.*)$")
    public void i_enter_the_lastname_lastname(String lastname) {
        driver.findElement(By.id("last-name")).sendKeys(lastname);
    }

    @And("I enter the postal code(.*)$")
    public void i_enter_the_postalcode_postalcode(String postalcode) {
        driver.findElement(By.id("postal-code")).sendKeys(postalcode);
    }

    @And("I click on continue button")
    public void i_click_on_continue_button() {
        driver.findElement(By.id("continue")).click();
    }

    @Then("Overview page is displayed")
    public void Overview_page_is_displayed() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();

    }

    @And("I click on the finish button")
    public void i_click_on_finish_button() {
        driver.findElement(By.id("finish")).click();
    }

    @Then("Confirmation page is displayed")
    public void Confirmation_page_is_displayed() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();

    }

    @After
    public void closeBrowser(){
      driver.quit();
    }


}
