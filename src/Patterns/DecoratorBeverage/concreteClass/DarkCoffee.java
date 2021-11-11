package Patterns.DecoratorBeverage.concreteClass;

import Patterns.DecoratorBeverage.abstracts.Beverage;

public class DarkCoffee extends Beverage {
    public DarkCoffee() {
        description = "Dark Coffee";
    }

    @Override
    public double price() {
        return 2.0;
    }
}
