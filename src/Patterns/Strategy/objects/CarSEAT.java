package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Car;
import Patterns.Strategy.flyBehaviorClass.CarNoFly;

public class CarSEAT extends Car{
    public CarSEAT() {
        flyBehavior = new CarNoFly();
    }

    @Override
    public void display() {
        System.out.println("Это машина СЕАТ АЛЬТЕА ФРИТРЕК. Очень хорошая машина для среднего класса");
    }
}
