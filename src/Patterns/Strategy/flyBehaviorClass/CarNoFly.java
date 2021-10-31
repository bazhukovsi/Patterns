package Patterns.Strategy.flyBehaviorClass;

import Patterns.Strategy.interfaces.FlyBehavior;

public class CarNoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Обычная машина без фантастических способностей");
    }
}
