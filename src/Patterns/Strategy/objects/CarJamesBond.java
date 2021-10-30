package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Car;

public class CarJamesBond extends Car {
    @Override
    public void display() {
        System.out.println("Машина Джеймса Бонда. Она умеет всё.");
    }
}
