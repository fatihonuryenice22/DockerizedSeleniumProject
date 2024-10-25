package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    // Properties dosyasını yükleyen method
    public static Properties initialize_Properties() {
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Config dosyası bulunamadı: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Config dosyası yüklenirken hata oluştu: " + e.getMessage());
        }
        return properties;  // Burada System.getProperties() yerine properties döndürüyoruz
    }

    public static Properties getProperties() {
        if (properties == null) {
            initialize_Properties();  // Eğer properties null ise initialize et
        }
        return properties;
    }
}
