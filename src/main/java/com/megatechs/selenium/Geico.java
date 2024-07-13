package com.megatechs.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Geico {

 @Test
    public void SeleniumTest3(){

     WebDriver driver = new ChromeDriver();
     driver.get("https://www.geico.com/");
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
     driver.manage().window().maximize();

    }
}
