package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        //Her açtıgımız classda ilk işimiz WebDriver dosyası oluşturmak olmalidir.

        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://testotomasyonu.com");

        //bize title'i getirir
        System.out.println(driver.getTitle());// Test Otomasyonu - Test Otomasyonu

        System.out.println(driver.getCurrentUrl()); //https://testotomasyonu.com/

        System.out.println(driver.getPageSource()); //HTML sayfanin tüm kaynak kodlarini getirir

        System.out.println(driver.getWindowHandle());
        //5C1AE448D5FA1A08D9CF4FF6BE39BFA1
        //2E66CC6E832CF9B8B036FFF9980E3F54
        //Selenium WebDriver actigi her browser için benzersiz bir handle deger uretir.
        //EGER testimiz calısırken driver objesi ile birden fazla window acildi ise
        //bu windowlar arasinda gecisi WindowHandle degerleri ile yapabiliriz.
        //8ACA1AE8A55EF3E34DDC346B506774BB

        System.out.println(driver.getWindowHandles());
        //[8ACA1AE8A55EF3E34DDC346B506774BB]
        //EGER driver birden fazla window açti ise
        //acik olan tüm windowlarin WindowHandleDegerlerini bize verir.


        Thread.sleep(3000);
        driver.quit();
    }
}
