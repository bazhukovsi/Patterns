package Patterns.AbstractFactory.bankSystem;

import Patterns.AbstractFactory.interfaces.Developer;

public class BankJavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write code for bank system.");
    }
}
