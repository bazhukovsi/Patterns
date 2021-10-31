package Patterns.StrategyDuck.voiceBehaviorClass;

import Patterns.StrategyDuck.interfaces.VoiceBehavior;

public class SqueakVoice implements VoiceBehavior {
    @Override
    public void voice() {
        System.out.println("Я - утка. Я умею пищать.");
    }
}
