package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practiseBrowserFactory {

    public static WebDriver startBrowser(String browserChoice, String Url) {

        WebDriver driver;
        switch (browserChoice.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException(("Browser not supported:"));

        }
        driver.manage().window().maximize();
        driver.get(Url);

        return driver;


    }
}



