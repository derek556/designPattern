package com.observer.byJdkOwn;

import java.util.Observable;

/**
 * Created by Administrator on 2016/7/7.
 */
public class WeatherData extends Observable{

    private float data1;
    private float data2;
    private float data3;

    public void dataChange(){
        setChanged();
        notifyObservers();
    }

    public void setData(float data1,float data2,float data3){

        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        dataChange();

    }

    public float getData1() {
        return data1;
    }

    public void setData1(float data1) {
        this.data1 = data1;
    }

    public float getData2() {
        return data2;
    }

    public void setData2(float data2) {
        this.data2 = data2;
    }

    public float getData3() {
        return data3;
    }

    public void setData3(float data3) {
        this.data3 = data3;
    }
}
