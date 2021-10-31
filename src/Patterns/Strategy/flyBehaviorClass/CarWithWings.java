package Patterns.Strategy.flyBehaviorClass;

import Patterns.Strategy.interfaces.FlyBehavior;

public class CarWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("У этой машины есть крылья. И она может летать");
    }
}
