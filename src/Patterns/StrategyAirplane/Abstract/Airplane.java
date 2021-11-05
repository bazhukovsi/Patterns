package Patterns.StrategyAirplane.Abstract;

import Patterns.StrategyAirplane.interfacesMotor.Motor;

public abstract class Airplane {
    public Motor motor;
    public abstract void fly();
    public abstract void display();

    public void performMotor(){
        motor.typeMotor();
    }

    public void setMotor (Motor motor){
        this.motor = motor;
    }

}
