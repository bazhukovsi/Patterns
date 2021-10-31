package Patterns.StrategyDuck.objects;

import Patterns.StrategyDuck.abstracts.Duck;
import Patterns.StrategyDuck.flyBehaviorClass.DuckNotFly;
import Patterns.StrategyDuck.flyBehaviorClass.FlyWithWings;
import Patterns.StrategyDuck.voiceBehaviorClass.KryakVoice;
import Patterns.StrategyDuck.voiceBehaviorClass.SqueakVoice;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new DuckNotFly();
        voiceBehavior = new SqueakVoice();
    }

    @Override
    public void display() {
        System.out.println("Я резиновая утка из магазина.");
    }

    @Override
    public void swim() {
        System.out.println("Я умею плавать в ванне.");
    }
}
