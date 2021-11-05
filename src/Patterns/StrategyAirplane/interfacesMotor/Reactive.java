package Patterns.StrategyAirplane.interfacesMotor;

public class Reactive implements Motor{
    @Override
    public void typeMotor() {
        System.out.println("Это самолет на реактивной тяге");
    }
}
