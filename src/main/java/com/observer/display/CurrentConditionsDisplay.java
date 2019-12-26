package com.observer.display;

import com.observer.DisplayElement;
import com.observer.Observer;
import com.observer.Subject;

/**
 * Created by Administrator on 2016/7/7.
 *
 *实现了观察者接口，当前类为一个观察者的对象
 *
 *根据案例，需要实现displayElement接口
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    Subject weatherData ; //观察者的主题

    float temperature ;
    float humidity ;

    //当前对象创建的时候，要指明充当观察者的主题，并注册
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions:"+temperature + " ||"+humidity);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();//数据更新是，显示也要相应的更新
    }
}
