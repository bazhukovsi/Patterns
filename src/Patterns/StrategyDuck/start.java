package Patterns.StrategyDuck;

import Patterns.StrategyDuck.abstracts.Duck;
import Patterns.StrategyDuck.objects.MallardDuck;
import Patterns.StrategyDuck.objects.RubberDuck;
import Patterns.StrategyDuck.objects.WoodDuck;

import java.util.ArrayList;
import java.util.List;

public class start {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RubberDuck();
        Duck duck3 = new WoodDuck();
        ducks.add(duck1);
        ducks.add(duck2);
        ducks.add(duck3);
        for(Duck duck : ducks ){
            duck.display();
            duck.swim();
            System.out.println("==================================================");
        }
    }
}
