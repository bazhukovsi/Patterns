package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Car;
import Patterns.Strategy.flyBehaviorClass.CarWithWings;

public class CarJamesBond extends Car{
    public CarJamesBond() {
        flyBehavior = new CarWithWings();
    }

    @Override
    public void display() {
        System.out.println("Машина Джеймса Бонда. Она умеет всё.");
    }
}
