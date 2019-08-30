package com.lonewolf.service.pattern.factory.abstractfactory.pizzafactory;

import com.lonewolf.service.pattern.factory.abstractfactory.entity.Pizza;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-30 14:25
 * @Description:
 */
public class CSPizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = new Pizza();
        pizza.setName(type);
        System.out.println("createpizza"+type);
        return pizza;
    }


}
