package Patterns.Strategy.abstracts;

import Patterns.Strategy.interfaces.VoiceBehavior;

public abstract class Pet {
    public VoiceBehavior voiceBehavior;

    public abstract void run();

    public void display() {
        System.out.println("Я домашнее животное");
    }

    public void setVoiceBehavior(VoiceBehavior voiceBehavior) {
        this.voiceBehavior = voiceBehavior;
    }
}
