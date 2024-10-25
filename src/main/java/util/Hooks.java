package util;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private WebDriver driver;

    @Before
    public void setUp() {
        String browser = System.getProperty("browser", "Chrome");
        driver = DriverFactory.initialize_Driver(browser);
        System.out.println("Tarayıcı başlatıldı.");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Tarayıcı kapatıldı.");
        }
    }
}
