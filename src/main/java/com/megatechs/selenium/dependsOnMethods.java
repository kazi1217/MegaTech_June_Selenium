package com.megatechs.selenium;

import org.testng.annotations.Test;

public class dependsOnMethods {

    @Test(dependsOnMethods = {"TestA"})
    public void TestC(){
        System.out.println("This will  execute second (SignIn)" );
    }

    @Test(dependsOnMethods ="TestA")
    public void TestB(){
        System.out.println("This will  execute first (Open Browser )");
    }


    @Test
    public void TestA(){
        System.out.println("This will  execute first (TestA )");
    }

}
