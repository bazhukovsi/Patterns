package Patterns.DecoratorString.decoratorClass;

import Patterns.DecoratorString.abstracts.Printer;

public class InsertLeftBracket extends Printer {
    Printer component;

    public InsertLeftBracket(Printer component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("[ ");
        component.print();
    }
}
