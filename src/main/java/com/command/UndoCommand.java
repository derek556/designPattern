package com.command;

public class UndoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("执行undo操作");
    }

    @Override
    public void undo() {

    }
}
