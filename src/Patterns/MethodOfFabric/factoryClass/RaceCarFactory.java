package Patterns.MethodOfFabric.factoryClass;

import Patterns.MethodOfFabric.concreteClass.RaceCar;
import Patterns.MethodOfFabric.interfaces.Car;
import Patterns.MethodOfFabric.interfaces.CarFactory;

public class RaceCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new RaceCar();
    }
}
