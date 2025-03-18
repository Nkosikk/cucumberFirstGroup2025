package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
    static WebDriver driver;


        public static WebDriver starBrowser(String browserChoice,String url){
            if (browserChoice.equalsIgnoreCase("chrome")){
                driver= new ChromeDriver();
            }else if(browserChoice.equalsIgnoreCase("edge")){
                driver= new EdgeDriver();
            }else {
                driver= new SafariDriver();
            }
            driver.manage().window().maximize();
            driver.get(url);
            return driver;
        }


        @Test
        public void test(){
            starBrowser("jhuyguhoihyhhujik","https://www.saucedemo.com/");
        }
}
