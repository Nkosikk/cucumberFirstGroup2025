package Steps;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver =browserFactory.startBrowser("chrome","https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver,LandingPage.class);
    CartPage cartPage = PageFactory.initElements(driver,CartPage.class);
    UserInformationPage userInformationPage = PageFactory.initElements(driver,UserInformationPage.class);
    CheckoutOverWiewPage checkoutOverWiewPage = PageFactory.initElements(driver,CheckoutOverWiewPage.class);

    ReadFromExcel readFromExcel;

    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
