package Patterns.StrategyPets;

import Patterns.StrategyPets.abstractPet.Pet;
import Patterns.StrategyPets.interfaces.CatVoice;
import Patterns.StrategyPets.interfaces.HorseVoice;
import Patterns.StrategyPets.interfaces.VoiceCow;
import Patterns.StrategyPets.objects.Cat;
import Patterns.StrategyPets.objects.Cow;
import Patterns.StrategyPets.objects.Horse;

import java.util.ArrayList;

public class start {
    public static void main(String[] args) {
        ArrayList <Pet> pets = new ArrayList<>();
        Pet pet1 = new Cat();
        pet1.setVoiceBehavior(new HorseVoice());
        Pet pet2 = new Cow();
        pet2.setVoiceBehavior(new CatVoice());
        Pet pet3 = new Horse();
        pet3.setVoiceBehavior(new VoiceCow());
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        for(Pet pet : pets){
            pet.display();
            pet.performVoice();
            System.out.println("======================================");
        }
    }
}
