package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.util.ElementScanner6;
import java.time.Duration;
import java.util.List;

public class C03_Locators {

    public static void main(String[] args) throws InterruptedException {


    //1- Bir test classı oluşturun ilgili ayarlari yapin
    System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
    //3- sayfada 147 adet link bulundugunu test edin

        List<WebElement>linkElementleriList=driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;

        if (linkElementleriList.size()==expectedLinkSayisi){
            System.out.println("Link testi PASSED");
        }else System.out.println("Link testi FAILED");
    //4- Products linkine tıklayın
        Thread.sleep(2000);



       //driver.findElement(By.linkText(" Products")).click();
        driver.findElement(By.partialLinkText("Products")).click();

    //5- special offer yazisinin görundugunu test edin
        WebElement specialOfferYaziElementi=driver.findElement(By.id("sale_image"));
        if (specialOfferYaziElementi.isDisplayed()) System.out.println("Yazi testi PASSED");
        else System.out.println("Yazi testi FAILED");


    //6- sayfayi kapatin
        driver.quit();
}
}
