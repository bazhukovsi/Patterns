package Patterns.StrategyDuck.objects;

import Patterns.StrategyDuck.abstracts.Duck;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Я утка - кряква. Я живу в природе.");
    }

    @Override
    public void swim() {
        System.out.println("Я умею плавать в озере или пруду. Я реальная утка");
    }
}
