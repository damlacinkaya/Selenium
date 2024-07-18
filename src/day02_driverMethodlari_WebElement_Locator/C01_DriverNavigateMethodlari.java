package day02_driverMethodlari_WebElement_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("WebDriver.chrome.driver","KurulumDosyalari/chromedriver");

        /*
        9.satirin görevi
        bilgisayarimizda fiziki olarak kullandiğimiz chrome versionuna uygun
        selenium.dev sitesinden indirdigimiz ve kobya browser oluşturmamızı saglayan
        chromedriver.exe dosyasini classimiz tanitmaktir.

        Selenium 4.0.0 versiyonu ile kütüphanelerine
        tüm güncel browserlara ait driverlari yükledi.
        Böylece bir class oluşturdugumuzda
        BİZ İSTERSEK kendi driverimizi 9.satiri kullanarak tanitabiliriz
        veya İSTERSEK 9.SATİRİ atlayip seleniumun kendi driverlarini kullanabiliriz.
         */

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        driver.navigate().to("https://wisequarter.com");

        //26. ve 28. satir işlev açısından aynıdır.
        Thread.sleep(2000);


        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(3000);
        driver.quit();
    }
}
