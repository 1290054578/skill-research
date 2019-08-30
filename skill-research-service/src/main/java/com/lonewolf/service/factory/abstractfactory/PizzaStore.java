package com.lonewolf.service.factory.abstractfactory;

import com.lonewolf.service.factory.abstractfactory.entity.Pizza;
import com.lonewolf.service.factory.abstractfactory.service.PackPizza;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-30 11:32
 * @Description:
 */
public abstract class PizzaStore {
//    @Autowired
//    PackPizza packPizza;

    /**
     * [下个披萨订单]
     * @author xiangyong.zeng
     * @param type
     * @return com.lonewolf.service.factory.simplefactory.entity.Pizza
     * @date 2019-08-30 11:41
     */
    public final Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        PackPizza packPizza = new PackPizza();
        packPizza.cut(pizza);
        packPizza.packagePizza(pizza);

        return pizza;
    }

    /**
     * [description]
     * @author xiangyong.zeng
     * @param type
     * @return com.lonewolf.service.factory.simplefactory.entity.Pizza
     * @date 2019-08-30 11:41
     */
    protected abstract Pizza createPizza(String type);
}
