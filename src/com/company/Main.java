package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Main {

    public WebDriver driver;

    @Before
    public void setupDriver(){

        System.setProperty("webdriver.chrome.driver", "D:\\Users\\Toshiba\\Selenium\\ChromeDriver\\chromedriver.exe");

        driver= new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/");

        driver.manage().window().maximize();

    }

    @Test
    public void Test(){

        driver.findElement(By.className("hwMdSM")).click();
        try {
            Thread.sleep(1000);
        }catch(Exception e){}

        driver.findElement(By.className("kNKwwK")).click();

        try {
            Thread.sleep(1000);
        }catch(Exception e){}

        driver.findElement(By.name("kullanici")).sendKeys("sarveny94@hotmail.com");
        driver.findElement(By.name("sifre")).sendKeys("Araba156");

        try {
            Thread.sleep(1000);
        }catch(Exception e){}

        driver.findElement(By.id("gg-login-enter")).click();

        try {
            Thread.sleep(1000);
        }catch(Exception e){}

        driver.findElement(By.name("k")).sendKeys("bilgisayar");

        try {
            Thread.sleep(1000);
        }catch(Exception e){}

        driver.findElement(By.className("qjixn8-0")).click();

        try {
            Thread.sleep(1000);
        }catch(Exception e){}

        driver.findElement(By.xpath(".//a[@href='/arama/?k=bilgisayar&sf=2' and text()=2]")).click();

        int min=11;
        int max=27;
        int randomSayi = ThreadLocalRandom.current().nextInt(min, max);

        try {
            Thread.sleep(1000);
        }catch(Exception e){}

        driver.findElement(By.xpath(".//li[@product-index='"+randomSayi+"']")).click();
        WebElement p=driver.findElement(By.xpath(".//li[@product-index="+randomSayi+"']/a/div/div/div/div[contains(@class, 'product-price-info')]/div/div/div/div/p"));
        String price=p.getText();

        try {
            Thread.sleep(1000);
        }catch(Exception e){}

        driver.manage().window().fullscreen();

        try {
            Thread.sleep(1000);
        }catch(Exception e){}

        driver.findElement(By.xpath(".//button[@id='add-to-basket']")).click();

        driver.findElement(By.xpath(".//a[text()='Sepete Git']")).click();

        WebElement price_basket=driver.findElement(By.xpath("//p[@class='new-price']"));
        String price2=price_basket.getText();
        if(price.compareTo(price2)>0){
            driver.findElement(By.xpath("//span[contains(@class, 'plus')]")).click();
        }
    }
    @After
    public void quitDriver(){
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.quit();
    }

}
