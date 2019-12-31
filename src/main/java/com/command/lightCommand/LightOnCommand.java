package com.command.lightCommand;

import com.command.Command;
import com.command.receiver.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void undo() {
        light.lightOn();// 这里 undo是把电灯打开
    }

}
