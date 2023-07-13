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

public class TrendyolTestCase05 {
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
        driver.get("https://giris.hepsiburada.com/?ReturnUrl=https%3A%2F%2Foauth.hepsiburada.com%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3DSPA%26redirect_uri%3Dhttps%253A%252F%252Fwww.hepsiburada.com%252Fuyelik%252Fcallback%26response_type%3Dcode%26scope%3Dopenid%2520profile%26state%3Da7c5b46903b449e6ad3afd363e38b3df%26code_challenge%3DVtMWWZ9YzCLUZul8TB8Agc18YOp3Sydk83B8KT05ZWg%26code_challenge_method%3DS256%26response_mode%3Dquery%26ActivePage%3DPURE_LOGIN%26oidcReturnUrl%3Dhttps%253A%252F%252Fwww.hepsiburada.com%252F");
       //2-
        driver.findElement(By.cssSelector("#txtUserName")).sendKeys("05469361863");
        Thread.sleep(5000);
        //3-
        WebElement aramaBarı=driver.findElement(By.xpath("//button[@id='btnLogin']"));
        aramaBarı.click();
        Thread.sleep(1000000);
        // Kullanıcı telefonuna gelen sıfreyı girer
        //4
        WebElement aramaButonu=driver.findElement(By.xpath(" //input[@placeholder='Ürün, kategori veya marka ara']"));
        aramaBarı.click();
        Thread.sleep(1000);
        aramaBarı.sendKeys("Televizyon"+ Keys.ENTER);
        Thread.sleep(1000);
        String windowHandle1=driver.getWindowHandle();
        WebElement tıklama=driver.findElement(By.xpath("//li[@id='i0']//div[@class='moria-ProductCard-eSkbaN cuRwNG sjoz8i29tp4']//div[3]"));
        tıklama.click();
        Set<String> handleDegerleriSet=driver.getWindowHandles();
        System.out.println("handleDegerleriSeti="+handleDegerleriSet);
        String windoeHandle2="";
        for (String each:handleDegerleriSet){
            if (!each.equals(windowHandle1)){
                windoeHandle2=each;
            }


    }
        driver.switchTo().window(windoeHandle2);
}
}
