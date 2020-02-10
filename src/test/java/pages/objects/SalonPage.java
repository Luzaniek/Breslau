package pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalonPage {

    @FindBy(linkText = "Spotkania")
    private WebElement spotkania;

    @FindBy(linkText = "Salon")
    private WebElement praeludium;
    @FindBy(linkText = "Kontakt")
    private WebElement kontakt;

    @FindBy(linkText = "News")
    private WebElement news;

    @FindBy(linkText = "LISTA SPOTKAŃ SALONU")
    private WebElement lista;


    @FindBy(partialLinkText = "401")
    private WebElement chm;

    WebDriver driver;


    public SalonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void goToSpotkania() {
        spotkania.click();
    }

    public void goToPraeludium() {
        praeludium.click();
    }


    public void goToKontakt() {
        kontakt.click();

    }


    public void goToNews() {
        news.click();
    }

    public String getTitle() {
        return driver.getTitle();


    }

    public void goToList() {
        lista.click();


    }


    public void checkingMeeting(String ppp) throws InterruptedException {

        driver.findElement(By.partialLinkText(ppp)).click();

        Thread.sleep(4000);


    }

}





