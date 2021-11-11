package Patterns.DecoratorString.decoratorClass;

import Patterns.DecoratorString.abstracts.Printer;

public class InsertRihgtBracket extends Printer{
    Printer component;

    public InsertRihgtBracket(Printer component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
        System.out.print(" ]");
    }
}
