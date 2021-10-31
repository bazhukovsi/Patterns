package Patterns.StrategyDuck.flyBehaviorClass;

import Patterns.StrategyDuck.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я реальная утка. Я умею летать.");
    }
}
