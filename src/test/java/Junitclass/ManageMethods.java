package Junitclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver gdriver=new ChromeDriver();
        gdriver.get("https://demoqa.com/");

        gdriver.manage().window().maximize();

        gdriver.manage().window().fullscreen();

        gdriver.manage().window().getPosition(); // Açıldıgı sayfanın konumunu verir.( Açıldıgı alanı verir)

        // gdriver.manage().window().setPosition();  Açıldıgı alanın ölçü birimini verir.


        System.out.println("Mevcut büyüklük"+gdriver.manage().window().getSize());

        Thread.sleep(2000);

        gdriver.manage().window().minimize();




















    }





















}
