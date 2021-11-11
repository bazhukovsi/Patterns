package Patterns.DecoratorBeverage.concreteClass;

import Patterns.DecoratorBeverage.abstracts.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double price() {
        return 2.35;
    }
}
