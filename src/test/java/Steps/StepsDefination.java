package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDefination extends Base{


    @Given("I am  in the login page")
    public void i_am_in_the_login_page() throws InterruptedException {

    }
    @And("I enter the username (.*)$")
    public void i_enter_the_username_username(String username) {
       loginPage.enterUsername(readFromExcel.username);
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

    /*@After
    /public void closeBrowser(){
        driver.quit();
    }*/

    @And("I select the cart")
    public void iSelectTheCart() {
    }

    /*
    @Then("I click the add to (.*) to the cart$")
    public void iClickTheAddToItemToTheCart(String productName ) {
        landingPage.clickAddToCart(productName);
    }
    */

    @And("I click (.*) add to cart button$")
    public void iClickItemAddToCartButton(String productName) {
        landingPage.clickAddToCart(productName);
    }


    @And("I click the cart button")
    public void iClickTheCartButton() {
        landingPage.clickCartButton();
    }

    @And("I confirm on the cart page")
    public void iConfirmOnTheCartPage() {
        cartPage.confirmYouAreOnCartPage();
    }

    @AfterStep
    public void addScreenshots(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots,"image/png","image");
        }
    }



    @And("I click the checkout button")
    public void iClickTheCheckoutButton() {
        cartPage.clickTheCheckoutButton();
    }


    //To be used later when adding multiple products
   /* @And("I confirm the items in the cart")
    public void iConfirmTheItemsInTheCart() {
        if (cartItems.isEmpty()) {
            throw new AssertionError("Cart is empty!");
        }
        for (WebElement item : cartItems) {
            if (!item.isDisplayed()) {
                throw new AssertionError("Cart item is not displayed!");
            }
        }
    }

    }*/

   // @After
   // public void closeBrowser(){
    //    driver.quit();
   // }

    @And("I enter the first Name (.*)$")
    public void iEnterTheFirstNameFirstName(String firstName) {
        userInformationPage.enterFirstName(firstName);

    }

    @And("I enter the last name (.*)$")
    public void iEnterTheLastNameLastName(String lastName) {
        userInformationPage.enterLastName(lastName);

    }

    @And("I enter the zip code (.*)$")
    public void iEnterTheZipCodeZipcode(String zipCode) {
        userInformationPage.enterZipCode(zipCode);
    }

    @And("I click the continue button")
    public void iClickTheContinueButton() {
        userInformationPage.clickContinueButton();
    }

    @Then("I verify that item total plus tax is equal to total")
    public void iVerifyThatItemTotalPlusTaxIsEqualToTotal() {
        checkoutOverWiewPage.verifyItemTotalPlusTaxIsEqualTotal();
    }


}
