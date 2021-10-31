package Patterns.StrategyDuck.abstracts;

import Patterns.StrategyDuck.interfaces.FlyBehavior;
import Patterns.StrategyDuck.interfaces.VoiceBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public VoiceBehavior voiceBehavior;

    public abstract void display();
    public abstract void swim();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performVoice(){
        voiceBehavior.voice();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setVoiceBehavior(VoiceBehavior voiceBehavior) {
        this.voiceBehavior = voiceBehavior;
    }
}
