package com.command;

import com.command.lightCommand.LightOffCommand;
import com.command.lightCommand.LightOnCommand;
import com.command.receiver.Light;

public class RemoteLoad {

    Command[] commands;

    public void setCommands(int slot, Command command) {
        commands[slot] = command;
    }

    public static void main(String[] args) {


        Light light = new Light("living name");
        Command lightOnCommand = new LightOnCommand(light);
        lightOnCommand.execute();

        Command lightOffCommand = new LightOffCommand(light);
        lightOffCommand.execute();
    }

}
