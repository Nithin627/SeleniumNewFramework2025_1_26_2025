package com.nithin.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.NotActiveException;
import java.util.Properties;

public final class ReadPropertyFile {

    private ReadPropertyFile(){

    }

    public static String getValue(String key) throws IOException {
        try{
        Properties prop =new Properties();
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Config/config.properties");
        prop.load(fis);
        return prop.getProperty(key);
        }catch (Exception e){
            throw new NullPointerException();
        }
    }


}
