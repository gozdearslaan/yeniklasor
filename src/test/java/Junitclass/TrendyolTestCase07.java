package Junitclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TrendyolTestCase07 {
    //Test Case 1
    //1."https://www.trendyol.com.tr" web sitesine git
    //2.Mouse mızı Anne ve Çocuk sekmesi üzerine getirelim
    //3.Alt sekmelerinden Bebek Bakımı içerisinden "Bebek Şampuanını" tıklayalım
    //4.Marka sekmesi altında "Nivea Baby" markasını seçelim
    //5."Fiyat" kısmına tıklayalım
    //6.Açılan alt sekmede "400 TL - 500 TL" yi seçelim


    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test01() throws InterruptedException {

    driver.get("https://www.trendyol.com/");
    //2-
    WebElement anneButonu= driver.findElement(By.xpath("//a[normalize-space()='Anne & Çocuk']"));
        anneButonu.click();
        Thread.sleep(1000);

        WebElement bebekButonu= driver.findElement(By.xpath("//ul[@class='sub-item-list']//a[contains(text(),'Bebek Şampuanı')]"));
        bebekButonu.click();
        Thread.sleep(1000);

        WebElement markabutonu= driver.findElement(By.xpath("//input[@placeholder='Marka ara']"));
        markabutonu.click();
        markabutonu.sendKeys("Nivea Baby"+ Keys.ENTER);
        Thread.sleep(1000);

        WebElement fiyatbutonu= driver.findElement(By.xpath("//div[@class='fltr-cntnr-ttl'][normalize-space()='Fiyat']"));
        fiyatbutonu.click();

        WebElement secilifiyatbutonu= driver.findElement(By.xpath("//div[@class='radio-button chcked']"));
        secilifiyatbutonu.click();




















    }
}
