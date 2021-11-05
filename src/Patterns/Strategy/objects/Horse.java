package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Pet;
import Patterns.Strategy.interfaces.HorseVoice;

public class Horse extends Pet {

     @Override
    public void run() {
        System.out.println("Я - конь. Я быстро бегаю и выступаю на скачках.");
    }
}
