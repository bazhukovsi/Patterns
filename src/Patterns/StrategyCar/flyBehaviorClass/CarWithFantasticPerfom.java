package Patterns.StrategyCar.flyBehaviorClass;

import Patterns.StrategyCar.interfaces.FlyBehavior;

public class CarWithFantasticPerfom implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("У меня турбо двигатель. Я могу летать и плавать под водой");
    }
}
