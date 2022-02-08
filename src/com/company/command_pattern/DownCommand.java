package com.company.command_pattern;

public class DownCommand implements ICommand{
    Television television;

    public DownCommand(Television television) {
        this.television = television;
    }
    @Override
    public void execute() {
        television.downVolume();
    }
}
