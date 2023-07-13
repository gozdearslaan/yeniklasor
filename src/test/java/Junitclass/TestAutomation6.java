package Junitclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestAutomation6 {
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


        //1. Tarayıcıyı başlatın
       // 2. 'http://automationexercise.com' URL'sine gidin
       // 3. Ana sayfanın başarıyla göründüğünü doğrulayın
       // 4. 'Bize Ulaşın' düğmesine tıklayın
       // 5. "İLETİŞİME GEÇİN"in görünür olduğunu doğrulayın
       // 6. Adı, e-postayı, konuyu ve mesajı girin
       // 7. Dosya yükleyin
       // 8. 'Gönder' düğmesini tıklayın
       // 9. Tamam düğmesine tıklayın
      //  10. Başarı mesajını doğrulayın 'Başarı! Bilgileriniz başarıyla gönderildi.' görünür
       // 11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla geldiğini doğrulayın

        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();
        Thread.sleep(2000);
        // name
        driver.findElement(By.xpath("//input[@placeholder='Name']"))
                .sendKeys("Gözde"+ Keys.ENTER);
        Thread.sleep(2000);
        // e-mail
        driver.findElement(By.xpath("//input[@placeholder='Email']"))
                .sendKeys("Gozde-arslan@windowslive.com"+ Keys.TAB);
        Thread.sleep(3000);
        // konu
        driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Cv bilgileri");
        Thread.sleep(3000);
        // mesaj
       driver.findElement(By.xpath("//textarea[@id='message']"))
         .sendKeys("Özgeçmiş Bilgileri"+ Keys.ENTER);
        Thread.sleep(2000);
        // dosya yükleyin
        driver.findElement(By.xpath("//input[@name='upload_file']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='submit']")).click();


















    }



















}
