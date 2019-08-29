package com.lonewolf.tool.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-29 13:52
 * @Description:
 */
public class JsonBean {


    public static <T>T jsonToMapOrJavaBean(JSON jsonObject,Class<T> clazz){
        return jsonObject.toJavaObject(clazz);
    }


    public static void mapToJsonOrJavaBean(Map map){
       Object object =  JSON.toJSON(map);
       JSONObject js = JSONObject.parseObject(object.toString());
       System.out.println(js);

       JSONObject ks = JSONObject.parseObject(JSON.toJSONString(map));
       System.out.println(ks);

       JSONObject jsonObject = new JSONObject(map);
       System.out.println(jsonObject);
    }

    public static void beanToJson(TestBean testBean){
        JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(testBean));
        System.out.println(jsonObject);

        JSON json = JSON.parseObject(JSON.toJSONString(testBean));
        System.out.println(json);

    }


    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","清风");
        jsonObject.put("age","25");

        Map<String,Object> map = jsonToMapOrJavaBean(jsonObject,Map.class);
        System.out.println("Map:" + map);

        TestBean testBean = jsonToMapOrJavaBean(jsonObject,TestBean.class);
        System.out.println("testBean:"+testBean);


        Map<String,Object> mapOri = new HashMap<>();
        mapOri.put("name","清风");
        mapOri.put("age","25");
        mapToJsonOrJavaBean(mapOri);

        TestBean testBean1 = new TestBean();
        testBean1.setAge("25");
        testBean1.setName("清风");
        beanToJson(testBean1);
    }

}
