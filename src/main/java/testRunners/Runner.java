package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

import java.net.MalformedURLException;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions", "util"},
        plugin = {"summary", "pretty", "html:Reports/CucumberReport/Reports.html"},
        monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {

    private static WebDriver driver;


    @BeforeClass
    public static void setUp() {
        try {
            String browser = System.getProperty("browser", "Chrome");
            driver = DriverFactory.initialize_Driver(browser);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Driver başlatılamadı: " + e.getMessage());
        }
    }


    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
