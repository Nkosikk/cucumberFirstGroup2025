package Steps;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver =browserFactory.starBrowser("chrome","https://www.saucedemo.com/");

}
