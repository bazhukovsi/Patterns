package Patterns.DecoratorApp;

import Patterns.DecoratorApp.abstarcts.Beverage;
import Patterns.DecoratorApp.concreteClass.DarkCoffee;
import Patterns.DecoratorApp.concreteClass.Espresso;
import Patterns.DecoratorApp.decoratorClass.CoffeeAndMilk;

public class decoratorTest {
    public static void main(String[] args) {
        Beverage beverage = new CoffeeAndMilk(new DarkCoffee());
        System.out.println(beverage.getDescription() + " = $" + beverage.price() );
        Beverage beverage1 = new CoffeeAndMilk(new Espresso());
        System.out.println(beverage1.getDescription() + " = $" + beverage1.price() );
    }
}
