import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TrendyolTestCase01 {
    WebDriver driver;

    @Before
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void TearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


    @Test
    public void radioButtonTest() throws InterruptedException {

        //Test Case 1: Register User
        //1. Trendyol.com sitesine git
        //2. Giriş Yap butonuna tıkla
        //3. Siteye e posta yazdır
        //4. Siteye şireni yazdır
        //5. Giriş yap butonuna tıkla
        //6. Arama butonuna televizyon yazdır
        //7. Çıkan ilk ürüne tıkla
        //8. Çıkan ilk ürünü sepetine ekle
        //9. Sepete eklenen ürünüs sepetten sil
        //10.Siline ürünü favorilerine ekle
        //11. favorilerine gir ürünü kontrol et
        //12. Sayfayı kapatarak testi sonlandır.

        //1. Trendyol.com sitesine git
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Giriş Yap butonuna tıkla
       driver.findElement(By.xpath("//p[contains(text(),'Giriş Yap')]")).isDisplayed();









    }
    }
