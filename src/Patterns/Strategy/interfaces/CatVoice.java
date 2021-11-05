package Patterns.Strategy.interfaces;

public class CatVoice implements VoiceBehavior {

    @Override
    public void voice() {
        System.out.println("Я мяукаю - Мяу, Мяу.");
    }
}
