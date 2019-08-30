package com.lonewolf.service.factory.simplefactory;

import com.lonewolf.service.factory.simplefactory.entity.Pizza;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-29 18:11
 * @Description: 匹萨商店
 */
public class PizzaStore {
  //  @Autowired
    SimplePizzaFactory simplePizzaFactory;

    @Autowired
    PizzaAction pizzaAction;

    /**
     * [有参构造器，在实例化披萨商店时，需要入参披萨工厂]
     *
     * @author xiangyong.zeng
     * @param simplePizzaFactory
     * @return 
     * @date 2019-08-29 18:13
     */
    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(Integer type){
        //工厂生产披萨
        Pizza pizza;
        pizza = simplePizzaFactory.createPizza(type);

        //对所有披萨做的同样切片操作
        pizzaAction.cut(pizza);

        //返回处理好的披萨
        return pizza;
    }
}
