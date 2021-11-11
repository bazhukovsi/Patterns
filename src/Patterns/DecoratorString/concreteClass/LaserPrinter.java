package Patterns.DecoratorString.concreteClass;

import Patterns.DecoratorString.abstracts.Printer;

public class LaserPrinter extends Printer {
    @Override
    public void print() {
        System.out.print("Hello world!!!!!!");
    }
}
