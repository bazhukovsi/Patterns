package Patterns.MethodOfFabric.factoryClass;

import Patterns.MethodOfFabric.concreteClass.CargoCar;
import Patterns.MethodOfFabric.interfaces.Car;
import Patterns.MethodOfFabric.interfaces.CarFactory;

public class CargoCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new CargoCar();
    }
}
