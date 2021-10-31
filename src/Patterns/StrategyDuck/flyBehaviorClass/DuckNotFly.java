package Patterns.StrategyDuck.flyBehaviorClass;

import Patterns.StrategyDuck.interfaces.FlyBehavior;

public class DuckNotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я не умею летать.");
    }
}
