package com.megatechs.selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Guru99AlertTwo {

    @Test(invocationCount = 4)
    public void dDemo() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement customerid=driver.findElement(By.xpath("//input[@name='cusid']"));
        customerid.sendKeys("1114674674");
        WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();

        Alert alert2 =driver.switchTo().alert();
        Thread.sleep(5000);
        alert2.accept();
        driver.close();
    }


    @Test(priority = 0)
    public void cDemo() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement customerID=driver.findElement(By.xpath("//input[@name='cusid']"));
        customerID.sendKeys("1114674674");
        WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        Alert alert =driver.switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
        driver.close();
    }


    @Test(priority = 1)
    public void aDemo() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement customerID=driver.findElement(By.xpath("//input[@name='cusid']"));
        customerID.sendKeys("1114674674");
        WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();

        Alert alert2 =driver.switchTo().alert();
        Thread.sleep(2000);
        String alertMessage1= driver.switchTo().alert().getText();
        System.out.println(alertMessage1);
        Thread.sleep(2000);
      // driver.close();
        driver.quit();


    }
    @Test(priority = 2)
    public void bDemo() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement customerID=driver.findElement(By.xpath("//input[@name='cusid']"));
        customerID.sendKeys("1114674674");
        WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        Alert alert2 =driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.dismiss();
        driver.close();
    }
}


