package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setup () {
        //Create a Chrome driver AUTOMATICALLY
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }

}
