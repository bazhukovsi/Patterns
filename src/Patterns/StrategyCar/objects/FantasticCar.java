package Patterns.StrategyCar.objects;

import Patterns.StrategyCar.abstracts.Car;
import Patterns.StrategyCar.flyBehaviorClass.CarWithFantasticPerfom;
import Patterns.StrategyCar.interfaces.FlyBehavior;

public class FantasticCar extends Car {

    public FantasticCar() {
        flyBehavior = new CarWithFantasticPerfom();
    }

    @Override
    public void display() {
        System.out.println("Я - фантастическая машина.");
    }
}
