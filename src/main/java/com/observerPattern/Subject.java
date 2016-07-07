package com.observerPattern;

/**
 * Created by Administrator on 2016/7/7.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public  void notifyObserver();

}
