package com.nithin.driver;

import com.nithin.utils.ReadPropertyFile;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
public final class DriverClass {

    private DriverClass(){

    }
//    private static WebDriver driver;

    public static void intDriver() throws IOException {
        System.out.println(Thread.currentThread().getId()+" : "+DriverManager.getDriver());
        if (Objects.isNull(DriverManager.getDriver())) {
            //System.setProperty("webdrievr.chrome.driver", cv.getCHROMEDRIVERPATH());
//            WebDriver driver = new ChromeDriver();
            DriverManager.setDriver(new ChromeDriver());
//          DriverManager.getDriver().get("https://www.google.com/");
            DriverManager.getDriver().get(ReadPropertyFile.getValue("URL"));
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
