package Junitclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {
        WebDriver gdriver=new ChromeDriver();
        gdriver.get("https://demoqa.com/");

        System.out.println("Mevcut pencere url"+ gdriver.getCurrentUrl());

        System.out.println("Hash Code: Sayfanın Hash codunu döndürür");gdriver.getWindowHandle();

        System.out.println("Sayfanın Başlıgı");gdriver.getTitle();

        System.out.println("Page Source");gdriver.getPageSource();

        System.out.println("--------------Page Source---------");
        System.out.println(gdriver.getPageSource());


























    }


















}
