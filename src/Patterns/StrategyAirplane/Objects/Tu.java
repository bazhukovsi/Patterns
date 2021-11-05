package Patterns.StrategyAirplane.Objects;

import Patterns.StrategyAirplane.Abstract.Airplane;
import Patterns.StrategyAirplane.interfacesMotor.Motor;
import Patterns.StrategyAirplane.interfacesMotor.Reactive;

public class Tu extends Airplane {

    public Tu() {
        motor = new Reactive();
    }

    @Override
    public void fly() {
        System.out.println("Это пассажирский самолет. Быстро летает. Перевозит пассажиров.");
    }

    @Override
    public void display() {
        System.out.println("Это пассажирский самолет.");
    }

}
