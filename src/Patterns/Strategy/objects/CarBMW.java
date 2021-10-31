package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Car;
import Patterns.Strategy.flyBehaviorClass.CarNoFly;
import Patterns.Strategy.interfaces.FlyBehavior;

public class CarBMW extends Car{
    public CarBMW() {
        flyBehavior = new CarNoFly();
    }

    @Override
    public void display() {
        System.out.println("Это машина БМВ. Она быстро едет. Хорошая машина для богатых");
    }
}
