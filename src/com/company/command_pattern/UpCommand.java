package com.company.command_pattern;

public class UpCommand implements ICommand{
    Television television;

    public UpCommand(Television television) {
        this.television = television;
    }
    @Override
    public void execute() {
        television.upVolume();
    }
}
