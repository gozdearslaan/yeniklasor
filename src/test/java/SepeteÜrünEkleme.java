import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SepeteÜrünEkleme {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialsninja.com/demo/index.php?route=common%2Fhome");
        WebElement aramaButonu=driver.findElement(By.cssSelector("input[placeholder='Search']"));
        aramaButonu.sendKeys("ıphone");
        aramaButonu.sendKeys(Keys.ENTER);

        WebElement list=driver.findElement(By.cssSelector(".fa.fa-th-list"));
        list.click();

        WebElement addToCart=driver.findElement(By.cssSelector("div[class='product-layout product-list col-xs-12'] button:nth-child(1)"));
        addToCart.click();
















    }














}
