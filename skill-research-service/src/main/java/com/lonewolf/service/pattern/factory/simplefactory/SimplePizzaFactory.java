package com.lonewolf.service.pattern.factory.simplefactory;

import com.lonewolf.service.pattern.factory.simplefactory.entity.ChessePizza;
import com.lonewolf.service.pattern.factory.simplefactory.entity.Pizza;
import com.lonewolf.service.pattern.factory.simplefactory.enumtool.PizzaEnum;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-29 15:40
 * @Description: 匹萨工厂
 */
public class SimplePizzaFactory {

    public Pizza createPizza(Integer type){
        Pizza pizza = null;

        switch (PizzaEnum.getPizzaEnum(type)){
            case CHEESE:
                pizza = new ChessePizza();
                break;
            default:
                break;
        }
        return pizza;
    }

}
