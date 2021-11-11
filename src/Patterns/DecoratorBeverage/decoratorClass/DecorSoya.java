package Patterns.DecoratorBeverage.decoratorClass;

import Patterns.DecoratorBeverage.abstracts.Beverage;
import Patterns.DecoratorBeverage.abstracts.DecoratorClass;

public class DecorSoya extends DecoratorClass {

    Beverage component;

    public DecorSoya(Beverage component) {
        this.component = component;
    }

    @Override
    public double price() {
        return component.price() + 2.35;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " Soya ; ";
    }
}

