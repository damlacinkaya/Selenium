package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtamasyon {
    public static void main(String[] args) throws InterruptedException {

        /*
        kurulum dosyalarını proje altına kopyalamak
        selenium ve chrome driveri projeye eklemek için yeterli değildir.

        Seleniumu kurmak için jar dosyalarını olusturdugumuz her projede 1 kez
        projeye tanıtmalıyız.
         */

        /*
        Selenium bizim istediğimiz tüm otamasyonları oluşturacağımız WebDriver objesi ile yapar.

        Selenium ile bir otomasyoon yapilacaksa
        once Web-Driver objesi oluşturulmalıdır.

         */

        System.setProperty("WebDriver.chorome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        //26.satir çalıştıgında, Selenium bilgisayarımızda var olan browser'lardan
        //sectigimizn bir kopyasını olusturup
        //otomasyon için bizim kodlarimizi bekler

        driver.get("https://www.testotomasyonu.com");
        /*
        otomasyonla bir url'e gitmek için tum url'i yazmamız gerekir.
        url'de https:// kullanılmazsa selenium verilen url'e gitmez.
        ama www kullanılmazsada olabilir.
         */

        Thread.sleep(5000);

        //driver.close();
        //driver oluşturulurken açılan window'u kapatır


        driver.quit();
        //driver çalştıgı müddetçe açılan tüm windowlari kapatir.

    }
}
