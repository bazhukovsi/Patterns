package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Car;

public class CarBMW extends Car {
    @Override
    public void display() {
        System.out.println("Это машина БМВ. Она быстро едет. Хорошая машина для богатых");
    }
}
