package com.megatechs.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class nopCommerceTwo {

    WebDriver driver = null;


    @Test
    public void seleniumTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement mouseOverToComputers = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
        actions.moveToElement(mouseOverToComputers).perform();
        WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops '][1]"));
        desktops.click();
        Thread.sleep(2000);

        WebElement mouseOverToComputers1 = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
        actions.moveToElement(mouseOverToComputers1).perform();
        WebElement noteBooks = driver.findElement(By.xpath("//a[text()='Notebooks '][1]"));
        noteBooks.click();
        Thread.sleep(2000);

        WebElement mouseOverToComputers2 = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
        actions.moveToElement(mouseOverToComputers2).perform();
        WebElement software = driver.findElement(By.xpath("//a[text()='Software '][1]"));
        software.click();
        Thread.sleep(2000);


        WebElement mouseOverToElectronics = driver.findElement(By.xpath("//a[text()='Electronics '][1]"));
        actions.moveToElement(mouseOverToElectronics).perform();
        WebElement cameraAndPhoto = driver.findElement(By.xpath("//a[text()='Camera & photo '][1]"));
        cameraAndPhoto.click();
        Thread.sleep(2000);

        WebElement mouseOverToElectronics1 = driver.findElement(By.xpath("//a[text()='Electronics '][1]"));
        actions.moveToElement(mouseOverToElectronics1).perform();
        WebElement cellPhone = driver.findElement(By.xpath("//a[text()='Cell phones ']"));
        cellPhone.click();
        Thread.sleep(2000);

        WebElement mouseOverToElectronics2 = driver.findElement(By.xpath("//a[text()='Electronics '][1]"));
        actions.moveToElement(mouseOverToElectronics2).perform();
        WebElement otherts = driver.findElement(By.xpath("//a[text()='Others ']"));
        otherts.click();
        Thread.sleep(2000);

        driver.close();

    }
}



