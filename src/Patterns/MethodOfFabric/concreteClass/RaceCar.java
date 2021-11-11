package Patterns.MethodOfFabric.concreteClass;

import Patterns.MethodOfFabric.interfaces.Car;

public class RaceCar implements Car {
    @Override
    public void carType() {
        System.out.println("Это гоночная машина. Она быстро ездит.");
    }
}
