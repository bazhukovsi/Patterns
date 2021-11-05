package Patterns.Strategy.objects;

import Patterns.Strategy.abstracts.Pet;
import Patterns.Strategy.interfaces.CowVoice;

public class Cow extends Pet {
    @Override
    public void run() {
        System.out.println("Я - корова. Небыстро, но бегаю.");
    }
}
