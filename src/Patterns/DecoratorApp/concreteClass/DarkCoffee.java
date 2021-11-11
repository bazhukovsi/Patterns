package Patterns.DecoratorApp.concreteClass;

import Patterns.DecoratorApp.abstarcts.Beverage;

public class DarkCoffee extends Beverage {
    public DarkCoffee() {
        description = "Dark Coffee";
    }

    @Override
    public double price() {
        return 3.0;
    }
}
