package day04_xpath_CssSelector_relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TextileXPathKullanimi {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("/*[text()='Add'"));
        //3- Remove butonu’nun gorunur oldugunu test edin
        WebElement removeButonu=driver.findElement(By.className("remove-btn"));
        if (removeButonu.isDisplayed()) System.out.println("Remove butonu testi PASSED");
        else System.out.println("Remove butonu testi FAILED");
        //4- Remove tusuna basin
        removeButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi= driver.findElement(By.tagName("h2"));

        if (addRemoveYaziElementi.isDisplayed()) System.out.println("Add Remove buttonu testi PASSED");
        else System.out.println("Add Remove buttonu testi FAILED");

        Thread.sleep(3000);
        driver.quit();
    }
}
