package Patterns.DecoratorApp.decoratorClass;

import Patterns.DecoratorApp.abstarcts.Beverage;

public class CoffeeAndMilk extends Beverage {
    Beverage component;

    public CoffeeAndMilk(Beverage component) {
        this.component = component;
    }
    public String getDescription(){
        return component.description + ", Milk ";
    }
    @Override
    public double price() {
        return component.price() + 2.0;
    }
}
