package Patterns.Strategy;

import Patterns.Strategy.abstracts.Pet;
import Patterns.Strategy.interfaces.CatVoice;
import Patterns.Strategy.interfaces.CowVoice;
import Patterns.Strategy.interfaces.HorseVoice;
import Patterns.Strategy.objects.Cat;
import Patterns.Strategy.objects.Cow;
import Patterns.Strategy.objects.Horse;

import java.util.ArrayList;
import java.util.List;

public class start {
    public static void main(String[] args) {
        List <Pet> pets = new ArrayList<>();
        Pet pet1 = new Cat();
        pet1.setVoiceBehavior(new HorseVoice());
        Pet pet2 = new Cow();
        pet2.setVoiceBehavior(new CatVoice());
        Pet pet3 = new Horse();
        pet3.setVoiceBehavior(new CowVoice());
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        for (Pet pet : pets){
            pet.run();
            pet.voiceBehavior.voice();
            System.out.println("================================================");
        }
    }
}
