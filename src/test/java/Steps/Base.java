package Steps;

import Pages.LandingPage;
import Pages.LoginPages;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {


    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver =browserFactory.startBrowser("chrome","https://www.saucedemo.com/");

    LoginPages loginPage = PageFactory.initElements(driver,LoginPages.class);
    LandingPage landingPage = PageFactory.initElements(driver,LandingPage.class);
    CartPage cartPage = PageFactory.initElements(driver,CartPage.class);


}
