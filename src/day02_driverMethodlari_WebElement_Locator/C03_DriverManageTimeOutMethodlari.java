package day02_driverMethodlari_WebElement_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageTimeOutMethodlari {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //implicitlyWait() bekleme odaklı degil iş odaklidir.
        // amacımız 10 sn beklemek değil amacimiz sayfanin açılmasını beklemektir.

        /*
        Thread.sleep() Javadan gelir.
        ve kodlarin calismasını bizim belirlediğimiz sürece durdurur.

        testi ilk defa yazarken test adimlarini görmemiz
        veya bir sunum yaptiğimizda
        sunum yaptiğimiz kişilere adimlari göstermemiz açisindan kullanımı UYGUNDUR.

        Bazen de bilgisayarimizin veya internetin hizindan dolayi
        kodlar hizli ilerlediğinde istediğimiz adimlari gerceklestiremeyebilir.
        bu durumda MECBUR KALİRSAK  Thread.sleep()  kullanılabilir.

        Eger testi hazirlamayi bitirdik ve hiz acisindan beklemeyi mecbur kilan bir durum yoksa
        Thread.sleep()'leri silmekte fayda vardir.



         */

        /*
        implicitlyWait() farkli olarak göreve dayali beklemeyi yapar.
        Biz 10 sn tanımladıgımızda
        görevi yapmak için max 10 sn bekler
        daha erken biterse yoluna devam eder, 10 saniyenin dolmasını beklemez.
        ANCAK 10 saniye dolmasına ragmen görev bitmedi ise
        exception firlatir ve çalışmayi durdurur.

        implicitlyWait() iki temel görev için bekleme yapar:
        1- sayfanin acilip, ogelerin yuklenmesi
        2- herhangi bir öğeyi kullanmamiz gerektiğinde o ogeyi bulmak

         */
        driver.quit();


    }
}
