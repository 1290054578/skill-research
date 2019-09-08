package com.lonewolf.service.pattern.equalhashcode;

import lombok.Data;

@Data
public class Person implements Comparable{
    /***
     * 姓名
     */
    private String name;

    /**
     * 职业
     */
    private String profession;

    /**
     * 年龄
     */
    private Integer age;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
