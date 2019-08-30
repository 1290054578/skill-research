package com.lonewolf.service.factory.abstractfactory.service;


import com.lonewolf.service.factory.abstractfactory.entity.Pizza;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-30 11:37
 * @Description:
 */
public class PackPizza {

    public void cut(Pizza pizza){
        System.out.println("cut"+pizza.getName());
    }

    public void packagePizza(Pizza pizza){
        System.out.println("package"+ pizza.getName());
    }

}
