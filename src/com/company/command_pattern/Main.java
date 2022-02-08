package com.company.command_pattern;

public class Main{

    public static void main(String[] args) {
        Television television = new Television();
        UpCommand up = new UpCommand(television);
        DownCommand down = new DownCommand(television);

        RemoteControl remote = new RemoteControl(up, down);
        remote.pressVolumeUp();
        System.out.println(television.getVolume());

        remote.pressVolumeDown();
        System.out.println(television.getVolume());
    }
}
