import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class AmazonTestCase01 {
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
        //driver.quit();
    }

    @Test
    public void test01() throws InterruptedException {


        //1. Tarayıcıyı açın.
        //2. [https://www.amazon.com.tr/](https://www.amazon.com.tr/cart) adresine gidin.
        //3. Çerez tercih kısmında çerezleri kabul edin.
        //4. Arama kutusuna "macbook air" yazın ve arayın.
        //5. Sonuçların görüntülendiğini kontrol edin.
        //6. Sol taraftaki "İşletim sistemi" filtresinden "Mac OS" seçin.
        //7. Çıkan ürünlerden 2. ürünün fiyatını alın.
        //8. İkinci ürüne tıklayın.
        //9. Açılan sayfada, önceki sayfada alınan ürün fiyatıyla karşılaştırma yaparak ürünün doğruluğunu kontrol edin. Kuruşlar önemli değildir.
        //10. Macbook seçeneklerinden "gümüş" rengini ve "512" kapasiteyi seçin.
        //11. "Sepete Ekle" düğmesine tıklayın.
        //12. "Sepete Eklendi" ibaresinin göründüğünü kontrol edin.
        //13. "Sepete Git" düğmesine tıklayın.
        //14. Miktar kısmından miktarı 1 artırın.
        //15. Miktarın arttığını kontrol edin.
        //16. "Sil" düğmesine tıklayın.
        //17. "Amazon sepetiniz boş." ibaresinin göründüğünü kontrol edin.


        driver.get("https://www.amazon.com.tr/");
        String ilksayfam=driver.getWindowHandle(); // ilk sayfayı tanıttık.
        Thread.sleep(1000);
        // CEREZ KAPATMA
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
        Thread.sleep(1000);
        WebElement aramaBarı=driver.findElement(By.xpath(" //input[ @id='twotabsearchtextbox']"));
        aramaBarı.click();
        Thread.sleep(1000);
        aramaBarı.sendKeys("macbook air"+ Keys.ENTER);
        Thread.sleep(1000);
        //Sol taraftaki "İşletim sistemi" filtresinden "150 TL üzeri kargo bedava" seçin.
        driver.findElement(By.xpath("(//*[@class='a-icon a-icon-checkbox'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@id='p_n_operating_system_browse-bin/12783157031']//i[@class='a-icon a-icon-checkbox']"));
        //6. Sol taraftaki "İşletim sistemi" filtresinden "Mac OS" seçin.
        driver.findElement(By.xpath("//*[text()='Mac OS']")).click();
        Thread.sleep(3000);
        //7. Çıkan ürünlerden 2. ürünün fiyatını alın.
       WebElement ikinciÜrün=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
        System.out.println(ikinciÜrün.getText());
        Thread.sleep(3000);
        // İkinci ürüne tıklayın.
        driver.findElement(By.xpath("(//a [@class='a-link-normal s-no-outline'])[2]")).click();
        Thread.sleep(3000);
        // Açılan sayfada, önceki sayfada alınan ürün fiyatıyla karşılaştırma yaparak ürünün doğruluğunu kontrol edin. Kuruşlar önemli değildir.
         WebElement karsılastırma=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[7]"));
        if (ikinciÜrün==karsılastırma){
            System.out.println("Test Passed");
        }
        // Macbook seçeneklerinden "gümüş" rengini  seçin.
        driver.findElement(By.xpath("//button[@id='a-autoid-12-announce']")).click();
        // Macbook seçeneklerinden "512" kapasiteyi seçin.
        driver.findElement(By.id("a-autoid-16-announce")).click();
        Thread.sleep(3000);
        //  "Sepete Ekle" düğmesine tıklayın.
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        // "Sepete Eklendi" ibaresinin göründüğünü kontrol edin.
        driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]")).isDisplayed();
        Thread.sleep(2000);
        //"Sepete Git" düğmesine tıklayın.
       driver.findElement(By.xpath("//span[@id='sw-gtc']//a")).click();
       //Miktar kısmından miktarı 1 artırın.
        driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).isDisplayed();
        // . Miktarın arttığını kontrol edin.
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a [@class='a-dropdown-link'])[2]")).click();
        // . "Sil" düğmesine tıklayın.
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input  [@class='a-color-link'])[1]")).click();
        //"Amazon sepetiniz boş." ibaresinin göründüğünü kontrol edin.
        driver.findElement(By.xpath("//h1[ @class='a-spacing-mini a-spacing-top-base']")).isDisplayed();
        System.out.println("TEST PASSED");





    }
}












