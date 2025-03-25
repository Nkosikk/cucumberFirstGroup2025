package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"Steps"},
        tags = "",
        plugin = {"pretty"},
        monochrome = true,
        publish = true)
public class runner extends AbstractTestNGCucumberTests {
}
