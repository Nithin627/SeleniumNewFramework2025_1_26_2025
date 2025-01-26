package com.nithin.tests;

import com.nithin.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginPageTest extends BaseTest{

    private LoginPageTest(){

    }

    @Test
    public void test1(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("foot Ball", Keys.ENTER);
        System.out.println("Login Page Test 1");
    }

    @Test
    public void test2(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Green", Keys.ENTER);
        System.out.println("Login Page Test 2");
    }

}
