package Patterns.StrategyAirplane.Objects;

import Patterns.StrategyAirplane.Abstract.Airplane;
import Patterns.StrategyAirplane.interfacesMotor.Motor;
import Patterns.StrategyAirplane.interfacesMotor.Propeller;

public class An extends Airplane {
    public An() {
        motor = new Propeller();
    }

    @Override
    public void fly() {
        System.out.println("АН уммет летать на недалекие расстояния");
    }

    @Override
    public void display() {
        System.out.println("Это самолет АН");
    }

}
