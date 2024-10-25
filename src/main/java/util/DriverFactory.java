package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.HashMap;
import java.util.Map;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver;
    static Properties properties;

    static {
        // Properties'in başlatılması (Statik blok ile)
        properties = ConfigReader.getProperties();
        if (properties == null) {
            throw new RuntimeException("Config dosyası yüklenemedi veya bulunamadı!");
        }
    }

    public static WebDriver initialize_Driver(String browser) {
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            // options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            Map<String, Object> timeouts = new HashMap<>();
            timeouts.put("implicit", 10000);
            timeouts.put("pageLoad", 20000);
            timeouts.put("script", 30000);

            options.setCapability("timeouts", timeouts);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);


            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(
                    Integer.parseInt(properties.getProperty("pageLoadTimeout", "10")), TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(
                    Integer.parseInt(properties.getProperty("implicityWait", "10")), TimeUnit.SECONDS);

            driver.get(properties.getProperty("url"));
            return driver;

        } catch (MalformedURLException e) {
            throw new RuntimeException("Hatalı Selenium Grid URL'si: " + e.getMessage());
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

