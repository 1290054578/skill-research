package com.lonewolf.tool.javabook.extendspractice;

public class Child extends Father {
    Child(double money,double bonus){
        super(money);
        this.bonus = bonus;
    }

    private static double bonus = 3.16;

    public double  getMoney111(){
        double count = bonus + super.getMoney();
        System.out.println(count);
        return count;
    }



    public static void main(String[] args) {
       Father father = new Child(0,1);
        System.out.println(((Child) father).getMoney111());
    }
}
