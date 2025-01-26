package com.nithin.frameworkconstants;

public final class ConstantValues {

    private ConstantValues(){

    }

    private static final String CHROMEDRIVERPATH =System.getProperty("user.dir")+"";

    public static String getCHROMEDRIVERPATH() {
        return CHROMEDRIVERPATH;
    }
}
