package com.nithin.tests;

import com.nithin.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class HomePageTest extends BaseTest{

    private HomePageTest(){

    }

    @Test
    public void test3(){
//        WebDriverManagerClass.intDriver();
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Animal", Keys.ENTER);
        System.out.println("Home Page Test");
    }
}
