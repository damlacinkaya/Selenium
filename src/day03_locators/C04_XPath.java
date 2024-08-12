package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class C04_XPath {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //dress için arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("dress"+ Keys.ENTER);

        //ürün bulunabildigini test edin



        //bulunan urun isimlerini yazdirin

        //sayfayi kapatin
    }
}
