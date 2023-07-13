package Junitclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonsOrnek {
    public static void main(String[] args) {

        //TEST CASE RADİOBUTTON ORNEKLERİ
        //1) Siteye gidin https://demoqa.com/radio-button
        //2) Sayfayı tam sayfa olarak ayarlayın
        //3) Sayfada 15 saniye bekleyin.
        //4) Yes radiobutton xpath alın.
        //5) Yes radiobutton tıklayın
        //6) Testiniz başarıyla sonlandırılmıştır yazdırın.


        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.
        WebElement yesradioButton = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        yesradioButton.isEnabled();
        if (yesradioButton.isEnabled());
        yesradioButton.click();
       System.out.println("testiniz başarıyla sonlandırılmıştır.");
        driver.close();

        //3- etkileyici butonuna tıklayın
        //WebElement EtkileyiciradioButton = driver.findElement(By.cssSelector("label[for='impressiveRadio']']"));
        //EtkileyiciradioButton.isEnabled();
        //if (EtkileyiciradioButton.isEnabled());
        //EtkileyiciradioButton.click();
        //System.out.println("EtkileyiciradioButton.");

        //driver.close();















    }














}
