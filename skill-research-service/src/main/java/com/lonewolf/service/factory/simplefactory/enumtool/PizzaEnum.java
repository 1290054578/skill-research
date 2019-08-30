package com.lonewolf.service.factory.simplefactory.enumtool;

import io.swagger.models.auth.In;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-29 15:45
 * @Description:
 */
public enum PizzaEnum {
    /**
     *
     */
    CHEESE(1,"cheese"),
    CLAM(2,"clam"),
    VEGGIE(3,"veggie");

    private Integer code;

    private String type;

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    PizzaEnum(Integer code,String type){
        this.code = code;
        this.type = type;
    }

    public static PizzaEnum getPizzaEnum(Integer code){
        for (PizzaEnum item: values()) {
            if(code.equals(item.getCode())){
                return item;
            }
        }
        return null;
    }
}
