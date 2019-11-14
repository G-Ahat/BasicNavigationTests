package com.cbt.tests;
import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        //getChrome();
       // getFirefox();
        getEdge();

    }

    public static void getEdge() {
        WebDriver driver=BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String actualTitleGoogle=driver.getTitle();

        driver.get("https://etsy.com");
        String actualTitleEtsy=driver.getTitle();

        driver.navigate().back();

        String expectedTitleGoogle=driver.getTitle();
        StringUtility.verifyEquals(expectedTitleGoogle,actualTitleGoogle);

        driver.navigate().forward();

        String expectedTitleEtsy=driver.getTitle();
        StringUtility.verifyEquals(expectedTitleEtsy,actualTitleEtsy);

        driver.quit();


    }

    public static void getFirefox() {
        WebDriver driver=BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String actualTitleGoogle=driver.getTitle();

        driver.get("https://etsy.com");
        String actualTitleEtsy=driver.getTitle();

        driver.navigate().back();

        String expectedTitleGoogle=driver.getTitle();
        StringUtility.verifyEquals(expectedTitleGoogle,actualTitleGoogle);

        driver.navigate().forward();

        String expectedTitleEtsy=driver.getTitle();
        StringUtility.verifyEquals(expectedTitleEtsy,actualTitleEtsy);

        driver.quit();

    }

   public static void getChrome() {
       WebDriver driver=BrowserFactory.getDriver("chrome");
       driver.get("https://google.com");
       String actualTitleGoogle=driver.getTitle();

       driver.get("https://etsy.com");
       String actualTitleEtsy=driver.getTitle();

       driver.navigate().back();

       String expectedTitleGoogle=driver.getTitle();
       StringUtility.verifyEquals(expectedTitleGoogle,actualTitleGoogle);

       driver.navigate().forward();

       String expectedTitleEtsy=driver.getTitle();
       StringUtility.verifyEquals(expectedTitleEtsy,actualTitleEtsy);

       driver.quit();

   }


}
