package Patterns.StrategyDuck.objects;

import Patterns.StrategyDuck.abstracts.Duck;

public class WoodDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Я деревянная утка. Сделана руками столяра.");
    }

    @Override
    public void swim() {
        System.out.println("Я держусь на воде. И никогда не утону. Я не плаваю, но я не утону.");
    }
}
