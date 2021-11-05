package Patterns.StrategyAirplane.interfacesMotor;

public class Propeller implements Motor{
    @Override
    public void typeMotor() {
        System.out.println("Это винотовой самолет");
    }
}
