package com.observer;

import com.observer.display.CurrentConditionsDisplay;
import com.observer.display.StatisticsDisplay;

/**
 * Created by Administrator on 2016/7/7.
 */
public class Test {

    public static void main(String[] args) {

        WeahterData weatherData = new WeahterData();//创建主题对象

        //创建一个观察者的对象，并指定是weatherData主题的一个观察者。构造方法中已注册
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //第二个观察者
        StatisticsDisplay statistics = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(11,22,33);

        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(10,20,30);


    }

}
