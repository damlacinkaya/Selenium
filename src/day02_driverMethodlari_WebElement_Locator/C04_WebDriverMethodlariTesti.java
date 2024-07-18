package day02_driverMethodlari_WebElement_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebDriverMethodlariTesti {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // 1. Yeni bir class olusturun (TekrarTesti)
       // 2. Youtube web sayfasına gidin
        driver.get("https://www.youtube.com");

        //ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        //eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        String expectedTitle="youtube";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("youtube title testi passed");
        }else {
            System.out.println("youtube title testi failed ");
            System.out.println("Actual title: "+actualTitle);
        }

        // 3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        // içermiyorsa doğru URL'yi yazdırın.

        String expectedYoutubeUrlIcerik="youtube";
        String actualYoutubeUrl=driver.getCurrentUrl();

        if (actualYoutubeUrl.contains(expectedYoutubeUrlIcerik)){
            System.out.println("Youtube Url testi passed");
        }else {
            System.out.println("Youtube Url testi failed");
            System.out.println("Actual youtube url: "+actualYoutubeUrl);
        }

        Thread.sleep(2000);



       // 4. Daha sonra testotomasyonu sayfasina gidin https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");
        Thread.sleep(2000);
       // 5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);
       // 6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);
       // 7. Testotomasyonu sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);
       // 8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        // 9. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedTitleIcerik="Test";
        actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("TestOtomosyoanu title testi passed");
        }else {
            System.out.println("TestOtomosyoanu title testi failed");
            System.out.println("actual title: "+actualTitle);

        }
       // 10.Sayfa URL'sinin https://www.testotomasyonu.com/ olup olmadığını test edin, degilse doğru URL'yi yazdırın
        String expectedUrl="https://www.testotomasyonu.com/";
        String actualUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test otomasyonu url testi PASSED");
        }else {
            System.out.println("Test otomasyonu url testi FAİLED");
            System.out.println("actual url:"+actualUrl);
        }
       // 11.Sayfayi kapatin

        driver.quit();



    }
}
