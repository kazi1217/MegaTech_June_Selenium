package com.megatechs.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Guru99 {

    @Test

    public void seleniumTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement radioButton =driver.findElement(By.xpath("//input[@value='roundtrip']"));
        radioButton.click();
        Thread.sleep(3000);


        Select passengerNumber = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
        passengerNumber.selectByVisibleText("2");
        Thread.sleep(3000);

        Select departingFrom = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
        departingFrom.selectByVisibleText("New York");
        Thread.sleep(3000);

        Select departingMonth = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
        departingMonth.selectByVisibleText("July");
        Thread.sleep(3000);

        Select departingDay = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
        departingDay.selectByVisibleText("31");
        Thread.sleep(3000);

        Select arrivingIn = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
        arrivingIn.selectByVisibleText("Seattle");
        Thread.sleep(3000);

        Select returningMonth = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
        returningMonth.selectByVisibleText("August");
        Thread.sleep(3000);

        Select returningDay = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
        returningDay.selectByVisibleText("9");
        Thread.sleep(3000);

        WebElement serviceClass= driver.findElement(By.xpath("//input[@value='First']"));
        serviceClass.click();
        Thread.sleep(3000);

        Select airlineName = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
        airlineName.selectByVisibleText("No Preference");
        Thread.sleep(3000);

        WebElement continueButton = driver.findElement(By.xpath("//input[@name='findFlights']"));
        continueButton.click();
        Thread.sleep(3000);

        WebElement backToHomeButton = driver.findElement(By.xpath("//img[@src='images/home.gif']"));
        backToHomeButton.click();
        Thread.sleep(5000);
        driver.close();

    }
}
