package Patterns.MethodOfFabric.factoryClass;

import Patterns.MethodOfFabric.concreteClass.SedanCar;
import Patterns.MethodOfFabric.interfaces.Car;
import Patterns.MethodOfFabric.interfaces.CarFactory;

public class SedanCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SedanCar();
    }
}
