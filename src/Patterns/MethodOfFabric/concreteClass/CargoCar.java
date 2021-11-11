package Patterns.MethodOfFabric.concreteClass;

import Patterns.MethodOfFabric.interfaces.Car;

public class CargoCar implements Car {
    @Override
    public void carType() {
        System.out.println("Это грузовой автомобиль. Он перевозит грузы.");
    }
}
