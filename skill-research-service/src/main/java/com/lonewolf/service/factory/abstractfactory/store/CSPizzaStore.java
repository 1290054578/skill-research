package com.lonewolf.service.factory.abstractfactory.store;

import com.lonewolf.service.factory.abstractfactory.pizzafactory.CSPizzaFactory;
import com.lonewolf.service.factory.abstractfactory.PizzaStore;
import com.lonewolf.service.factory.abstractfactory.entity.Pizza;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-30 11:43
 * @Description:
 */
public class CSPizzaStore extends PizzaStore {

   // @Autowired
   // CSPizzaFactory csPizzaFactory;

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        CSPizzaFactory csPizzaFactory = new CSPizzaFactory();
        pizza = csPizzaFactory.createPizza(type);
        return pizza;
    }
}
