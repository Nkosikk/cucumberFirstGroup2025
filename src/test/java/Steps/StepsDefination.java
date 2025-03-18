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
        driver.findElement(By.id("login-button")).click();

    }

    @Then("Landing page is displayed")
    public void landingPageIsDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

    @And("I select the cart")
    public void iSelectTheCart() {
    }
}
