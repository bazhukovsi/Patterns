package Patterns.StrategyCar.objects;

import Patterns.StrategyCar.abstracts.Car;
import Patterns.StrategyCar.flyBehaviorClass.CarNoFly;

public class CarSEAT extends Car{
    public CarSEAT() {
        flyBehavior = new CarNoFly();
    }

    @Override
    public void display() {
        System.out.println("Это машина СЕАТ АЛЬТЕА ФРИТРЕК. Очень хорошая машина для среднего класса");
    }
}
