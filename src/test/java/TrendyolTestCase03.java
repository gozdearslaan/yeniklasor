import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class TrendyolTestCase03 {

    // trendyol.com gidin
    // hali hazırda üzerinde çalıstıgımız window hash codunu alın
    // searchbar'a cüzdan yazdır ve aratınız
    // sonuclar içerisinden 1.ürüne tıklayınız
    //en altta bulunan daha fazla bersha cüzdan elementine tıklayınız
    // acılan pencerede kedi maması yazdırınız
    // 1.windowa dönünüz ve  url consola yazdırınız

    WebDriver driver;

    @Before
    public void tearDown(){driver.quit();}
    @Test
    public void test01() throws InterruptedException{
        // 1
        driver.get("https://www.trendyol.com/");
        //2
        String ilkSayfaWindowHandleDegeri=driver.getWindowHandle();
        //3
        driver.findElement(By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']"))
                .sendKeys("cüzdan"+ Keys.ENTER);
        //4
        driver.findElement(By.xpath("(//div[@class='p-card-wrppr with-campaign-view'][1])")).click();






















    }


























}
