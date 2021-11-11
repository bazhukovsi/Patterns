package Patterns.DecoratorBeverage.decoratorClass;

import Patterns.DecoratorBeverage.abstracts.Beverage;
import Patterns.DecoratorBeverage.abstracts.DecoratorClass;

public class DecorMilk extends DecoratorClass {
    Beverage component;

    public DecorMilk(Beverage component) {
        this.component = component;
    }

    @Override
    public double price() {
        return component.price() + 1.5;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " Milk ; ";
    }
}
