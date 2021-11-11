package Patterns.DecoratorBeverage;

import Patterns.DecoratorBeverage.abstracts.Beverage;
import Patterns.DecoratorBeverage.concreteClass.DarkCoffee;
import Patterns.DecoratorBeverage.concreteClass.Espresso;
import Patterns.DecoratorBeverage.decoratorClass.DecorMilk;
import Patterns.DecoratorBeverage.decoratorClass.DecorSoya;

public class test {
    public static void main(String[] args) {
        Beverage beverage = new DecorSoya(new DecorMilk(new DarkCoffee()));
        System.out.println(beverage.getDescription() + " $ " + beverage.price());
        Beverage beverage1 = new DecorSoya(new DecorMilk(new Espresso()));
        System.out.println(beverage1.getDescription() + " $ " + beverage1.price());
    }
}
