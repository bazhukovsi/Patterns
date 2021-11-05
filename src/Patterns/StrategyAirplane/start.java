package Patterns.StrategyAirplane;

import Patterns.StrategyAirplane.Abstract.Airplane;
import Patterns.StrategyAirplane.Objects.An;
import Patterns.StrategyAirplane.Objects.Su;
import Patterns.StrategyAirplane.Objects.Tu;
import Patterns.StrategyAirplane.interfacesMotor.Supersonic;

import java.util.ArrayList;

public class start {
    public static void main(String[] args) {
        ArrayList<Airplane> airplanes = new ArrayList<>();
        Airplane airplane1 = new An();
        Airplane airplane2 = new Tu();
        Airplane airplane3 = new Su();
        airplanes.add(airplane1);
        airplanes.add(airplane2);
        airplanes.add(airplane3);
        for (Airplane airplane : airplanes) {
            airplane.display();
            airplane.fly();
            airplane.performMotor();
            System.out.println("------------------------------------------");
        }
    }
}
