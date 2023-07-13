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

import java.sql.Driver;
import java.time.Duration;

public class TestAutomation9 {
    //Test Case 1
    //1."https://www.trendyol.com.tr" web sitesine git
    //Giriş yap butonuna tıkla
    //2.E-mail adresinizi girin
    //3.Şifrenizi girin
    //4.giriş yap butonuna tıklayın
    //5.Çok satanlar kategorisine tıkla
    //6.Çıkan ilk ürünü favorilere ekleyin
    //7.ürüne tıklayın
    // 8.Ürünü sepete ekleyin.


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

        driver.get("https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F");
        driver.findElement(By.xpath("//input[@id='login-email']"))
                .sendKeys("gozde-arslan@windowslive.com"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-password-input']"))
                .sendKeys("Atakan2502"+ Keys.TAB);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Giriş Yap')]")).click();
        Thread.sleep(2000);
        //5.Çok satanlar kategorisine tıkla
        ////a[text()='Çok Satanlar']/parent::li
        driver.findElement(By.xpath("//a[text()='Çok Satanlar']/parent::li")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='product-listing-container best-seller']//div[@class='product-card'][1]")).click();
        String ilksayfa= driver.getWindowHandle();
        String url=driver.getCurrentUrl();
        driver.findElement(By.xpath("//div[@class='container-right-content']//div[@class='add-to-basket-button-text']")).click();
        Thread.sleep(2000);

































    }

}
