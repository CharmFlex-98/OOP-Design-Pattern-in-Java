package com.company.command_pattern;

public class RemoteControl {
    private final UpCommand up;
    private final DownCommand down;

    public RemoteControl(UpCommand up, DownCommand down) {
        this.up = up;
        this.down = down;
    }

    public void pressVolumeDown() {
        down.execute();
    }

    public void pressVolumeUp() {
        up.execute();
    }
}
