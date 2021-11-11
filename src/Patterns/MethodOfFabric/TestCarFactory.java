package Patterns.MethodOfFabric;

import Patterns.MethodOfFabric.factoryClass.CargoCarFactory;
import Patterns.MethodOfFabric.factoryClass.RaceCarFactory;
import Patterns.MethodOfFabric.factoryClass.SedanCarFactory;
import Patterns.MethodOfFabric.interfaces.Car;
import Patterns.MethodOfFabric.interfaces.CarFactory;

public class TestCarFactory {
    public static void main(String[] args) {
        CarFactory carFactory = createCarByType("sedan");
        Car car = carFactory.createCar();
        car.carType();
    }
    public static CarFactory createCarByType(String type){
        if (type.equals("race")){
            return new RaceCarFactory();
        } else if (type.equals("cargo")){
            return new CargoCarFactory();
        } else if (type.equals("sedan")){
            return new SedanCarFactory();
        }
        throw  new RuntimeException("Неправильный тип машины");
    }
}
