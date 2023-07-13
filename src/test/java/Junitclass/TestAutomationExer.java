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

public class TestAutomationExer {

   // 1. Tarayıcıyı başlatın
    //2. 'http://automationexercise.com' URL'sine gidin
    //3. Ana sayfanın başarıyla göründüğünü doğrulayın
    //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
    //5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
    //6. Adı ve kayıtlı e-posta adresini girin
    //7. 'Kaydol' düğmesini tıklayın
    //8. 'E-posta Adresi zaten mevcut!' hatasını doğrulayın. görünür

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

        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']"))
                .sendKeys("Gözde"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@data-qa='signup-email']"))
                .sendKeys("Gozde-arslan@windowslive.com"+ Keys.ENTER);
        Thread.sleep(2000);
        WebElement KayıtButonu= driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
















}
}
