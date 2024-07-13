package com.megatechs.selenium;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

    @DataProvider(name = "data")
    public Object[][] dataMethod123(){
        return new Object[][] {{2, 3 , 5}, {5, 7, 12}};

    }

    @Test(dataProvider = "data")
    public void dataTest (int a, int b, int result) {
        int sum = a + b;
        System.out.println(sum);
        Assert.assertEquals(result, sum);
    }
}
