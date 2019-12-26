package com.observer.display;

import com.observer.DisplayElement;
import com.observer.Observer;
import com.observer.Subject;

/**
 * Created by Administrator on 2016/7/7.
 */
public class StatisticsDisplay implements Observer , DisplayElement {

    Subject weahterData;

    float data1;
    float data2;
    float data3;

    public StatisticsDisplay(Subject subject){
        this.weahterData = subject;
        subject.registerObserver(this);
    }

    public void display() {
        System.out.println("statistics:"+(data1+data2+data3));
    }

    public void update(float temp, float humidity, float pressure) {
        data1 = temp;
        data2 = humidity;
        data3 = pressure;
        display();
    }
}
