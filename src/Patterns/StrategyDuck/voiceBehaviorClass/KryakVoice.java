package Patterns.StrategyDuck.voiceBehaviorClass;

import Patterns.StrategyDuck.interfaces.VoiceBehavior;

public class KryakVoice implements VoiceBehavior {
    @Override
    public void voice() {
        System.out.println("Я реальная утка. Я издаю звуки - Кря Кря Кря");
    }
}
