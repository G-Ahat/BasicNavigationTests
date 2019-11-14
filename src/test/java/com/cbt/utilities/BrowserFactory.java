package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browserType){
     WebDriver driver=null;
        if ("chrome".equals(browserType.toLowerCase())) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if ("firefox".equals(browserType.toLowerCase())) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if ("edge".equals(browserType.toLowerCase())) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if ("safari".equals(browserType.toLowerCase())) {
            driver = null;
        }
        return driver;

    }
}
