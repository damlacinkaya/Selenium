package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class C02_Locators {

    public static void main(String[] args) {

        //1- Bir test class'i oluşturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //2- http://zero.webappsecurity.com/ adresine gidin
        driver.get("http://zero.webappsecurity.com/");
        //3- "ONLİNE BANKING" linkine tiklayin
        WebElement onlineBanking= driver.findElement(By.id("onlineBankingMenu"));
        onlineBanking.click();
        //4- Resim altinda 6 islem basligi oldugunu test edin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        int expectedsonucsayisi=6;
        List<WebElement>onlinebankinglist=driver.findElements(By.className("headers"));
        if (onlinebankinglist.size()==expectedsonucsayisi){
            System.out.println("Arama sonuc sayisi PASSED");
        }else System.out.println("Arama sonuc sayisi FAILED");

        //5- Islem basliklari icinde "Pay Bills" oldugunu test edin

        //1.YONTEM loop ile tum webelementlerin uzerindeki yazilari alip
        //oluşturacagımız String bir listeye koayabilir
        //ve contains()ile "Pay Bills"içeriyor mu diye test edebiliriz.

        List<String>islemIsimleriListesi=ReusableMethods.getStringList(onlinebankinglist);
        System.out.println(islemIsimleriListesi);

        if (islemIsimleriListesi.contains("Pay Bills")){
            System.out.println("Pay Bills testi PASSED");
        } else System.out.println("Pay Bills testi FAILED");


        //2.YONTEM, bir flag oluoluşturalim boolen PayBillVarMi=false;
        //for each loop ile her webelementin yazisini kontrol edelim
        //Pay Bills Olan varsa flag'i true yapalim
        //loop bitince flag true mu diye test edelim

        boolean payBillsVarMi=false;


        //6- Sayfayi kapatin
        driver.quit();
    }
}
