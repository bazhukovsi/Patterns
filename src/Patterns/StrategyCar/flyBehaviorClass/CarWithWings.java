package Patterns.StrategyCar.flyBehaviorClass;

import Patterns.StrategyCar.interfaces.FlyBehavior;

public class CarWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("У этой машины есть крылья. И она может летать");
    }
}
