package Patterns.StrategyCar.objects;

import Patterns.StrategyCar.abstracts.Car;

public class FantasticCar extends Car {
    @Override
    public void display() {
        System.out.println("Я - фантатсическая машина.");
    }
}
