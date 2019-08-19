package com.lonewolf.tool.observer;

import java.util.Observable;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-15 17:55
 * @Description: 内置观察者模式测试
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity, float pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }
}
