package Patterns.DecoratorString.decoratorClass;

import Patterns.DecoratorString.abstracts.Printer;

public class InsertDollar extends Printer {
    Printer component;

    public InsertDollar(Printer component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("$");
        component.print();
        System.out.print("$");
    }
}
