package Steps;

import Pages.AddToCartPage;
import Pages.LandingPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver =browserFactory.startBrowser("chrome","https://www.saucedemo.com/");

    // Screenshot
    TakesScreenshots takesScreenshot = new TakesScreenshots();

    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver,LandingPage.class);
    AddToCartPage addToCartPage = PageFactory.initElements(driver, AddToCartPage.class);

}
