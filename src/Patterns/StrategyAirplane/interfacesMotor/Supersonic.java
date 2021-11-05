package Patterns.StrategyAirplane.interfacesMotor;

public class Supersonic implements Motor {
    @Override
    public void typeMotor() {
        System.out.println("Это сверхзвуковой самолет");
    }
}
