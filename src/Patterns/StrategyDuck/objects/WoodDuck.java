package Patterns.StrategyDuck.objects;

import Patterns.StrategyDuck.abstracts.Duck;
import Patterns.StrategyDuck.flyBehaviorClass.DuckNotFly;
import Patterns.StrategyDuck.flyBehaviorClass.FlyWithWings;
import Patterns.StrategyDuck.voiceBehaviorClass.KryakVoice;
import Patterns.StrategyDuck.voiceBehaviorClass.NoVoice;

public class WoodDuck extends Duck {

    public WoodDuck() {
        flyBehavior = new DuckNotFly();
        voiceBehavior = new NoVoice();
    }

    @Override
    public void display() {
        System.out.println("Я деревянная утка. Сделана руками столяра.");
    }

    @Override
    public void swim() {
        System.out.println("Я держусь на воде. И никогда не утону. Я не плаваю, но я не утону.");
    }
}
