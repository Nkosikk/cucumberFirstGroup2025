package Steps;

import Pages.CartPage;
import Pages.LandingPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver =browserFactory.startBrowser("chrome","https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver,LandingPage.class);
    CartPage cartPage = PageFactory.initElements(driver,CartPage.class);

}
