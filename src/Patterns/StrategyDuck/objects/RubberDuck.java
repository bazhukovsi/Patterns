package Patterns.StrategyDuck.objects;

import Patterns.StrategyDuck.abstracts.Duck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Я резиновая утка из магазина.");
    }

    @Override
    public void swim() {
        System.out.println("Я умею плавать в ванне.");
    }
}
