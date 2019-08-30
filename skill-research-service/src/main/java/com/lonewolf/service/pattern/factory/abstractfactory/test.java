package com.lonewolf.service.pattern.factory.abstractfactory;

import com.lonewolf.service.pattern.factory.abstractfactory.entity.Pizza;
import com.lonewolf.service.pattern.factory.abstractfactory.service.PackPizza;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-30 14:33
 * @Description:
 */
public class test {

    static abstract class PizzaStore {
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


   static class CSPizzaStore extends PizzaStore {

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

    static class CSPizzaFactory {

        public Pizza createPizza(String type){
            Pizza pizza = new Pizza();
            pizza.setName(type);
            System.out.println("createpizza"+type);
            return pizza;
        }


    }


    public static void main(String[] args) {
        PizzaStore pizzaStore = new CSPizzaStore();
        pizzaStore.orderPizza("CSPizza");
    }
}
