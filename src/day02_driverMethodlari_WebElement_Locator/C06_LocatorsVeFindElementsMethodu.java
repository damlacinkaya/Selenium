package day02_driverMethodlari_WebElement_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class C06_LocatorsVeFindElementsMethodu {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chorome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //test otomasyonu anasayfaya gidin
        driver.get("https://testotomasyonu.com");

    //arama kutusuna phone yazip aratin

        //Tek satır kod yazmak için
        driver.findElement(By.id("global-search")).sendKeys("phone"+ Keys.ENTER);

        //WebElement aramaKutusu= driver.findElement(By.id("global-search"));
        //aramaKutusu.sendKeys("phone");
        //aramaKutusu.submit();


    //arama sonucunda 3 den fazla ürün bulunabildiğini test edin.

        //1.yöntem: arama sonuc yazısı olan "4 Product Found" yazisindaki  4'ü
        //          sayi olarak kaydedip

        WebElement aramaSonucElementi=driver.findElement(By.className("product-count-text" ));

        System.out.println(aramaSonucElementi.getText());//4 Products Found

        //bize int 4 lazim GERİ KALLANI OLMAYACAK

        String aramaSonucYazisi= aramaSonucElementi.getText();// "4 Products Found"
        aramaSonucYazisi=aramaSonucYazisi.replaceAll("\\D",""); //"4"

        int actualAramaSonucYazisi=Integer.parseInt(aramaSonucYazisi);//4
        int expectedMinSonucSayisi=3;

        if (actualAramaSonucYazisi>expectedMinSonucSayisi){
            System.out.println("Arama sonuc sayisi PASSED");
        }else System.out.println("Arama sonuc sayisi FAİLED");

        //2.YÖNTEM bulunan ürünleri bir liste olarak kaydedip
        //listenin size'ini 3 den büyük oldugunu test edebiliriz.

      List<WebElement>bulunanUrunElementleriList = driver.findElements(By.className("prod-img"));
      if (bulunanUrunElementleriList.size()>expectedMinSonucSayisi){
          System.out.println("Arama sonuc sayisi PASSED");
      }else System.out.println("Arama sonuc sayisi FAİLED");



        //sayfayi kapatin.

        Thread.sleep(3000);

        driver.quit();






    }
}
