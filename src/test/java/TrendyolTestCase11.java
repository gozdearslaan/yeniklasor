import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class TrendyolTestCase11 {
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

        // hepsiburada.com sitesine gidiniz.
        //Kategorilerden Elektronik kısmından dizüstü bilgisayara tıkla
        // Sayfada açılan çok tercih edilen windows 11 bannerına tıkla
        //marka olarak asus markasını seç
        //İlk çıkan ürüne git
        // ilk çıkan ürüne gittikten sonra ek hizmet sigortaya tıkla
        // daha sonra ürünü sepete ekle
        // sepete git sepete gittikten sonra sıklıkla birlikte alınanlardan çıkan ilk ürünü sepete ekle.

        driver.get("https://www.hepsiburada.com/");
        String ilksayfam=driver.getWindowHandle();

        WebElement ElektronikButonu= driver.findElement(By.xpath("(//span[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC'])[1]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(ElektronikButonu).perform();
        Thread.sleep(4000);
         WebElement bilgisayarButonu=driver.findElement(By.xpath("//a[text()='Bilgisayar/Tablet']"));
        Thread.sleep(4000);
         // TEXT İLE LACATOR ALMA
        actions.moveToElement(bilgisayarButonu).perform();
        WebElement dizüstübilgisayarButonu=driver.findElement(By.xpath("//a[text()='Dizüstü Bilgisayar']"));
        Thread.sleep(4000);
        dizüstübilgisayarButonu.click();
        Thread.sleep(5000);
        // Banner Tıklama
        driver.findElement(By.xpath("//div[@class='categoryBanner']//img[@title='windowslu_laptoplar']")).click();
        //marka olarak asus markasını seç
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Asus']")).click();
        Thread.sleep(5000);
       // İlk çıkan ürüne git
        Set<String> TumPencereler=driver.getWindowHandles();
        for (String handle : TumPencereler) {
            if (!handle.equals(ilksayfam)){
                driver.switchTo().window(handle);
                break;
            }
        }
        //ilk çıkan ürüne gittikten sonra ek hizmet sigortaya tıkla
       driver.findElement(By.xpath("//*[text()='Ekle']")).click();
        Thread.sleep(4000);
        //daha sonra ürünü sepete ekle
        driver.findElement(By.xpath("//button[@id='addToCart']")).click();
        Thread.sleep(4000);
        //sepete git sepete gittikten sonra sıklıkla birlikte alınanlardan çıkan ilk ürünü sepete ekle.
        driver.findElement(By.xpath("//div[@class='sf-reco-cXJJFj eDFt sbgcse06alz']")).click();
























    }
}
