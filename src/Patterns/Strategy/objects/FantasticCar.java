package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Car;

public class FantasticCar extends Car {
    @Override
    public void display() {
        System.out.println("Я - фантатсическая машина.");
    }
}
