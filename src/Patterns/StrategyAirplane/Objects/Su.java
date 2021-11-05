package Patterns.StrategyAirplane.Objects;

import Patterns.StrategyAirplane.Abstract.Airplane;
import Patterns.StrategyAirplane.interfacesMotor.Motor;
import Patterns.StrategyAirplane.interfacesMotor.Supersonic;

public class Su extends Airplane {

    public Su() {
        motor = new Supersonic();
    }

    @Override
    public void fly() {
        System.out.println("Очень быстро летает. На борту имеет оружие");
    }

    @Override
    public void display() {
        System.out.println("Это сверхзвуковой самолет");
    }

}
