package com.nithin.tests;

import com.nithin.driver.DriverClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;


public class BaseTest {

    protected BaseTest(){

    }

    @BeforeMethod
    protected void setUP() throws IOException {
        DriverClass.intDriver();
    }

    @AfterMethod
    protected void tearDown(){
         DriverClass.quitDriver();
    }
}
