package Patterns.StrategyCar.flyBehaviorClass;

import Patterns.StrategyCar.interfaces.FlyBehavior;

public class CarNoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Обычная машина без фантастических способностей");
    }
}
