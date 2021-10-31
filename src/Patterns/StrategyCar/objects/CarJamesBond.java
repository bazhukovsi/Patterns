package Patterns.StrategyCar.objects;

import Patterns.StrategyCar.abstracts.Car;
import Patterns.StrategyCar.flyBehaviorClass.CarWithWings;

public class CarJamesBond extends Car{
    public CarJamesBond() {
        flyBehavior = new CarWithWings();
    }

    @Override
    public void display() {
        System.out.println("Машина Джеймса Бонда. Она умеет всё.");
    }
}
