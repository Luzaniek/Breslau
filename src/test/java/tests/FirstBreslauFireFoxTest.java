package tests;

import org.testng.annotations.Test;
import pages.objects.StartPage;

public class FirstBreslauFireFoxTest extends TestBase {


    String google = "http://google.pl";

    @Test


    public void myFirstFireFoxTest() throws InterruptedException {

        driver.navigate().to(google);

        StartPage start = new StartPage(driver);

        start.startPage();


    }


}
