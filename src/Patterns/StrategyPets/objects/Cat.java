package Patterns.StrategyPets.objects;

import Patterns.StrategyPets.abstractPet.Pet;
import Patterns.StrategyPets.interfaces.CatVoice;

public class Cat extends Pet {

    public Cat() {
        voiceBehavior = new CatVoice();
    }

    @Override
    public void run() {
        System.out.println("Я умею быстро бегать и убегать от собак.");
    }

    @Override
    public void display() {
        System.out.println("Я - кошка. У меня " + countOfLegs + " лапы.");
    }

}
