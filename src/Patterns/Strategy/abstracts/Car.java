package Patterns.Strategy.abstracts;

public abstract class Car {

    public void brake() {
        System.out.println("Машина тормозит");
    }

    public void gaz() {
        System.out.println("Машина разгоняется");
    }

    public abstract void display();

}
