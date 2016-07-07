package com.observerPattern.byJdkOwn;



/**
 * Created by Administrator on 2016/7/7.
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setData(11,22,33);

    }

}
