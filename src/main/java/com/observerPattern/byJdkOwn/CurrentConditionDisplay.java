package com.observerPattern.byJdkOwn;


import com.observerPattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/7/7.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    Observable observable;
    private  float data1;
    private float data2;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("jdk:"+(data1+data2));
    }



    public void update(Observable obs ,Object args){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.data1 = weatherData.getData1();
            this.data2 = weatherData.getData2();
            display();
        }
    }
}
