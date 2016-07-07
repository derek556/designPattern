package com.observerPattern;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/7.
 */
public class WeahterData implements Subject {

    public ArrayList observers;
    public float temperature;
    public float humidity;
    public float pressure;

    public WeahterData(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 测量值发生变化
     */
    public void measurementsChanged(){
        notifyObserver();
    }


    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //weatherData其他方法........

}
