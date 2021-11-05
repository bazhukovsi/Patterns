package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Pet;
import Patterns.Strategy.interfaces.CatVoice;

public class Cat extends Pet {
    @Override
    public void run() {
        System.out.println("Я кошка. Я умею бегать и убегать от злых собак.");
    }
}
