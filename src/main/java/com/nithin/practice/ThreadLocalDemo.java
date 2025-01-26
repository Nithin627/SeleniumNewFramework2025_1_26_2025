package com.nithin.practice;

public class ThreadLocalDemo {

    private static ThreadLocal<String> atm =new ThreadLocal<>();
    int a=5;

    public static String getMoney(){
        return atm.get();
    }
    public static void depositMoney(String money){
        atm.set(money);
    }

    public static void closeAccount(){
        atm.remove();
    }
}
