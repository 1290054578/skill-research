package com.lonewolf.tool.javabook.extendspractice;

public class Father {
    Father(double money){
        this.money =money;
    }

    private static double money = 2.16;

    public static double getMoney(){
        return  money;
    }
}
