package com.lonewolf.service.pattern.equalhashcode;

import lombok.Data;

@Data
public class Student extends Person{
    /***
     * 成绩
     */
    private String grade;

    public static StringBuilder get(int a){
        return new StringBuilder(String.valueOf(a));
    }

    public static void main(String[] args) {
        System.out.println(get(11).equals(get(11)));
    }

}
