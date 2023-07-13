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
import java.util.Set;

public class TrendyolTestCase06 {
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


        //1- https://www.hepsiburada.com/ web sitesine gidiniz.
        //2- giriş yap sayfasına tıklayın
        //3- e-postanızı girin
        //4- şifrenizi girin
        //5- giriş yap butonunu tıklayın
        //6- arama butonuna tıklayın
        //7- arama butonuna televizyon yazdırın
        //8-çıkan ilk ürüne tıklayın
        //9-ilk ürünü sepete ekleyin
        // -sepete gidin
        // -Sepette siparişi onaylayın


        //1-
        driver.get("https://www.hepsiburada.com/");
        //2-
        WebElement aramaButonu= driver.findElement(By.xpath("//input[@placeholder='Ürün, kategori veya marka ara']"));
        aramaButonu.click();
        Thread.sleep(1000);


        aramaButonu.sendKeys("Televizyon"+ Keys.ENTER);
        Thread.sleep(1000);

        WebElement ılkUrun=driver.findElement(By.xpath("//div[@class='moria-ProductCard-fJNuEt fDVJ spssr2p79sy'][1]"));
        ılkUrun.click();
        Thread.sleep(1000);

        WebElement ıkıncıUrun=driver.findElement(By.xpath("//div[@class='moria-ProductCard-fJNuEt fDVJ spssr2p79sy'][1]"));
        ılkUrun.click();
        Thread.sleep(1000);


        Set<String>windowHandleSeti=driver.getWindowHandles();
        System.out.println(windowHandleSeti);


















    }
}
