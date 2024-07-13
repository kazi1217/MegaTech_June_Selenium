package com.megatechs.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class nopCommerce {
    WebDriver driver =null;

@Test
    public void SeleniumTest5() throws InterruptedException {

    driver = new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}

    public void alertDemo() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement menuOptions = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
        actions.moveToElement(menuOptions).perform();
        Thread.sleep(2000);
        WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops '][1]"));
        desktop.click();
        Thread.sleep(2000);
}

        public void demoMethod() throws InterruptedException {
        WebElement searchButton = driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input' and @name='q']"));
        searchButton.sendKeys("Apple MacBook");
        WebElement searchClickButton = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
        searchClickButton.click();
        Thread.sleep(2000);;

        // WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        // register.click();
        // Thread.sleep(5000);

        // Different Approch :
        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        Thread.sleep(2000);

        WebElement maleButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        maleButton.click();
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Kazi");
        Thread.sleep(2000);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Rahman");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("kazi1217tanu@gmail.com");
        Thread.sleep(2000);

        WebElement companyName = driver.findElement(By.xpath("//input[@id='Company']"));
        companyName.sendKeys("MegaTechs");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("1971Bangladesh");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("1971Bangladesh");
        Thread.sleep(2000);

        WebElement confirmRegister = driver.findElement(By.xpath("//button[@id='register-button']"));
        confirmRegister.click();
        Thread.sleep(2000);

        WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
        login.click();
        Thread.sleep(2000);

        driver.close();

    }
}


