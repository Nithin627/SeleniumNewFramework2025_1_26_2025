package com.nithin.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager(){

    }

    private static ThreadLocal<WebDriver> dr=new ThreadLocal<>();

//    private static ThreadLocal<WebDriver> dr=ThreadLocal.withInitial(()->{
//        System.setProperty("webdriver.chrome.driver","");
//        return new ChromeDriver();
//    });

    public static WebDriver getDriver() {
        return dr.get();
    }

    public static void setDriver(WebDriver driver) {
        dr.set(driver);
    }

    public static void unload(){
        dr.remove();
    }
}
