package Patterns.MethodOfFabric.concreteClass;

import Patterns.MethodOfFabric.interfaces.Car;

public class SedanCar implements Car {
    @Override
    public void carType() {
        System.out.println("Это легковая машина. Она возит семью по городы и на дачу.");
    }
}
