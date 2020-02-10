package pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage {


    private By q = By.name("q");


    @FindBy(name = "q")
    private WebElement findInGoole;

    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

// Metoda
    public void startPage() throws InterruptedException {

        findInGoole.click();
//        WebElement kkk = driver.findElement(q);
//        ///ddd.click();
        Thread.sleep(2000);
        findInGoole.sendKeys("Ala ma kota");
        Thread.sleep(3000);
        findInGoole.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
//        WebElement eee = driver.findElement(By.name("btnK"));
//        eee.click();
//        Thread.sleep(2000);


    }

}
