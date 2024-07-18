package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {

    public static void main(String[] args) throws InterruptedException {

        /*







        6. Sayfa handle degerini yazdirin
       7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        8. Sayfayi kapatin.
         */

        System.setProperty("WebDriver.chrome.driver","KurulumDosyalari/chromedriver");

        //1. https://trendyol.com sayfasina gidelim.

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.trendyol.com/");

        //2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 3. Sayfa basliginin “Trendyol” icerdigini test edin
        String expectedTitleIcerik="Trendyol";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("tıttle test passed");
        }else System.out.println("title test failed");


        //4.Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());

        //5. Sayfa url’inin
       // https://www.trendyol.com/"
        //oldugunu test edin.

        String expectedURL="https://www.trendyol.com/";
        String actualURL= driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)){
            System.out.println("URL TEST PASSED");
        }else System.out.println("URL TEST FAILED");

        System.out.println(driver.getWindowHandle());

        String expectedHTMLicerik="alisveris";
        String actualTitleHTML=driver.getPageSource();

        if (actualTitleHTML.contains(expectedHTMLicerik)){
            System.out.println("HTML test PASSED");
        }else System.out.println("HTML test FAILED");

        Thread.sleep(3000);
        driver.quit();



    }
}
