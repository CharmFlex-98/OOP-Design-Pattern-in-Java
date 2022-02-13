package com.company.facade_pattern;

public class Facade {
    Television tv;
    Speaker speaker;

    public Facade(Television tv, Speaker speaker) {
        this.tv = tv;
        this.speaker = speaker;
    }

    public void watchV() {
        tv.on();
        tv.increaseScreenBrightness();
        speaker.on();
        speaker.increaseVolume();
    }
}
