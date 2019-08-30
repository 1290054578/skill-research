package com.lonewolf.service.pattern.factory.abstractfactory.pizzafactory;

import com.lonewolf.service.pattern.factory.abstractfactory.entity.Pizza;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-30 15:04
 * @Description:
 */
public class BJPizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = new Pizza();
        pizza.setName(type);

        System.out.println("createPizza"+type);

        return pizza;
    }

}
