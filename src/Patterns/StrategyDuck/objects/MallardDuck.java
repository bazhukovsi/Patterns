package Patterns.StrategyDuck.objects;

import Patterns.StrategyDuck.abstracts.Duck;
import Patterns.StrategyDuck.flyBehaviorClass.FlyWithWings;
import Patterns.StrategyDuck.voiceBehaviorClass.KryakVoice;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        voiceBehavior = new KryakVoice();
    }

    @Override
    public void display() {
        System.out.println("Я утка - кряква. Я живу в природе.");
    }

    @Override
    public void swim() {
        System.out.println("Я умею плавать в озере или пруду. Я реальная утка");
    }
}
