package Patterns.StrategyDuck.voiceBehaviorClass;

import Patterns.StrategyDuck.interfaces.VoiceBehavior;

public class NoVoice implements VoiceBehavior {
    @Override
    public void voice() {
        System.out.println("Я - утка. Но я не умею издавать звуки.");
    }
}
