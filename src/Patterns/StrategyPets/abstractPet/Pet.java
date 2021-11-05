package Patterns.StrategyPets.abstractPet;

import Patterns.StrategyPets.interfaces.VoiceBehavior;

public abstract class Pet {
    public VoiceBehavior voiceBehavior;
    public static final int countOfLegs = 4;

    public abstract void run();

    public abstract void display();

    public void performVoice() {
        voiceBehavior.voice();
    }

    public void setVoiceBehavior(VoiceBehavior voiceBehavior) {
        this.voiceBehavior = voiceBehavior;
    }
}
