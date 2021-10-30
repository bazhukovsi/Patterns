package Patterns.Strategy.abstracts;

import Patterns.Strategy.interfaces.FlyBehavior;

public abstract class Car {
    FlyBehavior flyBehavior;

    public void brake() {
        System.out.println("Машина тормозит");
    }

    public void gaz() {
        System.out.println("Машина разгоняется");
    }

    public void perfomFly(){
        flyBehavior.fly();
    }
    public void perfomFlyWing(){
        flyBehavior.flyWing();
    }
    public void perfomNotFly(){
        flyBehavior.notFly();
    }

    public abstract void display();

}
