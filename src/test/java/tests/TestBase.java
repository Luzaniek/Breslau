package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;


    @BeforeMethod
    public void beforeTest() {
//        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
//        driver = new ChromeDriver();

//
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
//        driver.navigate().to("http://google.pl");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);


    }


    @AfterMethod
    public void afterTest() {
        driver.close();
        //  driver.quit();


    }
}