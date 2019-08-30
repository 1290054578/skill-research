package com.lonewolf.service.pattern.factory.simplefactory;

import com.lonewolf.service.pattern.factory.simplefactory.entity.Pizza;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-30 10:50
 * @Description:
 */
public class PizzaAction {


    public void cut(Pizza pizza){
        System.out.println("pizza切片");
    }
}
