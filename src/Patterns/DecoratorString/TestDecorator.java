package Patterns.DecoratorString;

import Patterns.DecoratorString.abstracts.Printer;
import Patterns.DecoratorString.concreteClass.LaserPrinter;
import Patterns.DecoratorString.decoratorClass.InsertDollar;
import Patterns.DecoratorString.decoratorClass.InsertLeftBracket;
import Patterns.DecoratorString.decoratorClass.InsertRihgtBracket;

public class TestDecorator {
    public static void main(String[] args) {
        Printer printer = new InsertDollar(new InsertRihgtBracket(new InsertLeftBracket(new LaserPrinter())));
        printer.print();
    }
}
