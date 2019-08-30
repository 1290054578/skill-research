package com.lonewolf.service.factory.abstractfactory.store;

import com.lonewolf.service.factory.abstractfactory.PizzaStore;
import com.lonewolf.service.factory.abstractfactory.entity.Pizza;
import com.lonewolf.service.factory.abstractfactory.pizzafactory.BJPizzaFactory;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-30 11:43
 * @Description:
 */
public class BJPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type){
        Pizza pizza;
        BJPizzaFactory bjPizzaFactory = new BJPizzaFactory();
        pizza = bjPizzaFactory.createPizza(type);

        return pizza;
    }

}


