package Junitclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lacators {
    public static void main(String[] args) {

        WebDriver gdriver=new ChromeDriver();
        gdriver.get("https://demoqa.com/");

        gdriver.findElement(By.id("userName")); // Id gösterimi
        gdriver.findElement(By.name("color-schene")); //
        gdriver.findElement(By.className("form-label")); //
        gdriver.findElement(By.tagName("label")); //



















    }






















}
