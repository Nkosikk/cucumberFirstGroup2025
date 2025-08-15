package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Stepdefinition {
    WebDriver driver;

    @Given("I am in the login page")
    public void i_am_in_the_login_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
    }

    @And("I enter the username (.*)$")
    public void i_enter_the_username_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I enter the password (.*)$")
    public void i_enter_the_password_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("I click  the button")
    public void i_click_the_the_button() {
        driver.findElement(By.id("login-button")).click();

    }

    @Then("Landing page is displayed")
    public void landing_page_is_displayed() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
