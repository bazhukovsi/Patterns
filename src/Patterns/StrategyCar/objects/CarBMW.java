package Patterns.StrategyCar.objects;

import Patterns.StrategyCar.abstracts.Car;
import Patterns.StrategyCar.flyBehaviorClass.CarNoFly;

public class CarBMW extends Car{
    public CarBMW() {
        flyBehavior = new CarNoFly();
    }

    @Override
    public void display() {
        System.out.println("Это машина БМВ. Она быстро едет. Хорошая машина для богатых");
    }
}
