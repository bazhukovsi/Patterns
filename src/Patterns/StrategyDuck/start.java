package Patterns.StrategyDuck;

import Patterns.StrategyDuck.abstracts.Duck;
import Patterns.StrategyDuck.flyBehaviorClass.DuckNotFly;
import Patterns.StrategyDuck.flyBehaviorClass.FlyWithWings;
import Patterns.StrategyDuck.objects.MallardDuck;
import Patterns.StrategyDuck.objects.RubberDuck;
import Patterns.StrategyDuck.objects.WoodDuck;
import Patterns.StrategyDuck.voiceBehaviorClass.KryakVoice;
import Patterns.StrategyDuck.voiceBehaviorClass.NoVoice;
import Patterns.StrategyDuck.voiceBehaviorClass.SqueakVoice;

import java.util.ArrayList;
import java.util.List;

public class start {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        Duck duck1 = new MallardDuck();
        duck1.setFlyBehavior(new DuckNotFly());
        duck1.setVoiceBehavior(new NoVoice());
        Duck duck2 = new RubberDuck();
        duck2.setFlyBehavior(new FlyWithWings());
        duck2.setVoiceBehavior(new SqueakVoice());
        Duck duck3 = new WoodDuck();
        duck3.setFlyBehavior(new FlyWithWings());
        duck3.setVoiceBehavior(new KryakVoice());
        ducks.add(duck1);
        ducks.add(duck2);
        ducks.add(duck3);
        for(Duck duck : ducks ){
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performVoice();
            System.out.println("==================================================");
        }
    }
}
