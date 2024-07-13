package com.megatechs.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Guru99Alert {

    WebDriver driver = null;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //driver.manage().window().fullscreen();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test(priority = 1)
    public void alertDemoClickOnButton() throws InterruptedException {
        WebElement customerID = driver.findElement(By.xpath("//input[@name='cusid']"));
        customerID.sendKeys("1234556565565");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
    }
    @Test(priority = 0)
    public void alertDemoGetText() throws InterruptedException {
        WebElement customerID = driver.findElement(By.xpath("//input[@name='cusid']"));
        customerID.sendKeys("1234556565565");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        Thread.sleep(2000);
        //Alert alert = driver.switchTo().alert();
        //alert.getText();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void alertDemoCancel() throws InterruptedException {
        WebElement customerID = driver.findElement(By.xpath("//input[@name='cusid']"));
        customerID.sendKeys("1234556565565");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
    }
}
