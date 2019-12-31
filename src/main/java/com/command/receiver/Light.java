package com.command.receiver;

public class Light {

    String lightName;
    public Light() {

    }

    public Light(String lightName) {
        this.lightName = lightName;
    }

    public void lightOn() {
        System.out.println("light on");
    }

    public void lightOff() {
        System.out.println("light off");
    }

}
