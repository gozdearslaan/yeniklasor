import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SepetOrnegıTrendyol {
    public static void main(String[] args) {

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.trendyol.com/");
            WebElement aramaButonu=driver.findElement(By.cssSelector("input[placeholder='Aradığınız ürün, kategori veya markayı yazınız']"));
            aramaButonu.sendKeys("ıphone");
            aramaButonu.sendKeys(Keys.ENTER);
            WebElement uygula=driver.findElement(By.cssSelector(".apply-filter-button"));
            uygula.click();



















    }
}
