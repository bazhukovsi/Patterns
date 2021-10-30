package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Car;

public class CarSEAT extends Car {
    @Override
    public void display() {
        System.out.println("Это машина СЕАТ АЛЬТЕА ФРИТРЕК. Очень хорошая машина для среднего класса");
    }
}
