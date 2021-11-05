package Patterns.StrategyPets.objects;

import Patterns.StrategyPets.abstractPet.Pet;
import Patterns.StrategyPets.interfaces.HorseVoice;

public class Horse extends Pet {

    public Horse() {
        voiceBehavior = new HorseVoice();
    }

    @Override
    public void run() {
        System.out.println("Я умею скакать.");
    }

    @Override
    public void display() {
        System.out.println("Я - лошадь. У меня " + countOfLegs + " ноги.");
    }
}
