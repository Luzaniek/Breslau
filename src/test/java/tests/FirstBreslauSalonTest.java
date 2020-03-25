package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.objects.SalonPage;
import pages.objects.StartPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FirstBreslauSalonTest extends TestBase {

    String urlSalon = "http://www.salonprofesoradudka.pl";
    String titleSalon = "SALON PROFESORA DUDKA";
    String titleSpotkania = "Salon Spotkania";
    String titlePraeludium = "PRAELUDIUM";
    String titleKontakt = "Kontakt";
    String titleNews = "NEWS";
    String titleLista = "Salon Lista Spotkań";
    String ppp;

    @Test

    public void myFirstTest() throws InterruptedException {

        driver.navigate().to(urlSalon);
        Thread.sleep(1000);


        SalonPage salonPage = new SalonPage(driver);
        String titleReceived = salonPage.getTitle();

        System.out.println(titleReceived);
        assertEquals(titleSalon, titleReceived);
        Thread.sleep(2000);

        salonPage.goToSpotkania();
        Thread.sleep(2000);
        System.out.println(salonPage.getTitle());
        assertEquals(salonPage.getTitle(), titleSpotkania);

        driver.navigate().back();
        System.out.println(salonPage.getTitle());
        assertEquals(salonPage.getTitle(), titleSalon);
        Thread.sleep(1000);


        driver.navigate().back();
        salonPage.goToPraeludium();
        System.out.println(salonPage.getTitle());
        assertEquals(salonPage.getTitle(), titlePraeludium);
        Thread.sleep(1000);

        driver.navigate().back();
        salonPage.goToKontakt();
        System.out.println(salonPage.getTitle());
        assertEquals(salonPage.getTitle(), titleKontakt);
        Thread.sleep(1000);

        driver.navigate().back();
        salonPage.goToNews();
        System.out.println(salonPage.getTitle());
        assertEquals(salonPage.getTitle(), titleNews);


        driver.navigate().to(urlSalon);
        assertEquals(salonPage.getTitle(), titleSalon);
        System.out.println(salonPage.getTitle());
        salonPage.goToSpotkania();
        System.out.println(salonPage.getTitle());
        assertEquals(salonPage.getTitle(), titleSpotkania);

        salonPage.goToList();
        System.out.println(salonPage.getTitle());
        assertEquals(salonPage.getTitle(), titleLista);
        Thread.sleep(1000);


//        for(int i=401; i < 410; i++) {
//            String ccc = String.valueOf(i);
//            salonPage.checkingMeeting(ccc);
//            Thread.sleep(1000);
//            System.out.println(driver.getTitle());
//            assertTrue(driver.getTitle().contains(ccc));
//            driver.navigate().back();
//        }
    }
        @Test
                public void countingPicturesTest() throws InterruptedException {

        String numerSpotkania = "402";
        driver.navigate().to(urlSalon);
            SalonPage salonPage = new SalonPage(driver);
            salonPage.goToSpotkania();
            salonPage.goToList();
            salonPage.checkingMeeting(numerSpotkania);
            salonPage.countPictures(numerSpotkania);
        }


    }



