package day02_driverMethodlari_WebElement_Locator;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C02_DriverManageWindowMethodlari {
    public static void main(String[] args) throws InterruptedException {

      LocalTime localTime=LocalTime.now();
      long baslangicSaniye=localTime.toSecondOfDay();

        System.setProperty("WebDriver.chrome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();

        //açilan pencereyi tam ekran açar.
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://www.testotomasyonu.com");

        System.out.println("Maximize size: "+driver.manage().window().getSize()); //Maximize size: (1280, 715)
        System.out.println("Maximize konum: "+driver.manage().window().getPosition()); //Maximize konum: (230, 1105)
        Thread.sleep(2000);

        //eger tüm ekrani kaplamasini istersek
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen size: "+driver.manage().window().getSize()); //Fullscreen size: (1280, 776)
        System.out.println("Fullscreen konum: "+driver.manage().window().getPosition());

        // konumu (200,200) ve boyutu da (800,500) yapın
        driver.manage().window().setPosition(new Point(200,200));
        driver.manage().window().setSize(new Dimension(800,500));

        System.out.println("Özel boyut size: "+driver.manage().window().getSize());
        System.out.println("Özel boyut konum: "+driver.manage().window().getPosition());



        Thread.sleep(5000);
        driver.quit();

        LocalTime localTime2= LocalTime.now();
        long bitisSaniye=localTime.toSecondOfDay();
        System.out.println("SÜRE: "+(bitisSaniye-baslangicSaniye));

    }
}
