import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TrendyolTestCase02 {
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

    // 2. Trendyol gidiniz.  .
    // 3. 5 saniye hard wait ile bekleyiniz, sonra sayfayı refreshleyiniz.
    // 4. arama bar'ına tıklayınız.
    // 5. arama bar'ına "televizyon" yazınız.
    // 6. ara butonuna tıklayınız.
    // 7. alışveriş sepetine tıklayınız.
    // 8. web safyasını kapatınız.

    //1. Trendyol.com sitesine git
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement aramaBari= driver.findElement(By.cssSelector("input[placeholder='Aradığınız ürün, kategori veya markayı yazınız']"));
        aramaBari.click();
        Thread.sleep(1000);
        aramaBari.sendKeys("Televizyon");
        Thread.sleep(1000);
        WebElement araButtonu=driver.findElement(By.cssSelector(".cyrzo7gC"));
        araButtonu.click();
        WebElement alisverisSepeti=driver.findElement(By.xpath("//p[normalize-space()='Sepetim']"));
        alisverisSepeti.click();
        Thread.sleep(5000);
        driver.close();




























    }

}
