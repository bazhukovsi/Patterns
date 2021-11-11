package Patterns.DecoratorApp.concreteClass;

import Patterns.DecoratorApp.abstarcts.Beverage;

public class Espresso extends  Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double price() {
        return 2.0;
    }
}
