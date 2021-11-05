package Patterns.StrategyPets.objects;

import Patterns.StrategyPets.abstractPet.Pet;
import Patterns.StrategyPets.interfaces.VoiceCow;

public class Cow extends Pet {

    public Cow() {
        voiceBehavior = new VoiceCow();
    }

    @Override
    public void run() {
        System.out.println("Я умею бегать, но не т ак быстро как лошадь.");
    }

    @Override
    public void display() {
        System.out.println("Я - корова. У меня " + countOfLegs + " ноги.");
    }
}
