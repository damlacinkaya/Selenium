package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTestOtamasyonu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chorome.driver","KurulumDosyalari/chromedriver");

        WebDriver driver=new ChromeDriver();

       // 1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");

       // 2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

        String expectedTitleIcerik="Test Otomasyonu";
        String actualTitle= driver.getTitle();
        //actual title driverdan alinir.

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAİLED");
        //Title testi PASSED

       // 4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

       // 5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

        String expectedUrl= "https://testotomasyonu.com/";
        String actualUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");
        //Url testi FAILED

       // 6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //60F02224A78F28EB4C2CDBE51C4F2E14

       // 7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin

        String expectedHtmlIcerik="otomasyon";
        String actualSayfaKaynagi= driver.getPageSource();
        if (actualSayfaKaynagi.contains(expectedHtmlIcerik)){
            System.out.println("Sayfa kaynagi testi PASSED");
        } else System.out.println("Sayfa kaynagi testi FAILED");

        //Sayfa kaynagi testi PASSED


       // 8. Sayfayi kapatin.

        Thread.sleep(3000);
        driver.quit();




    }
}
