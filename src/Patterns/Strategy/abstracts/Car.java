package Patterns.Strategy.abstracts;

import Patterns.Strategy.interfaces.FlyBehavior;

public abstract class Car {
    public FlyBehavior flyBehavior;

    public void brake() {
        System.out.println("Машина тормозит. Метод родителя.");
    }

    public void gaz() {
        System.out.println("Машина разгоняется. Метод родителя.");
    }

    public void perfomFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }

    public abstract void display();

}
