package Patterns.Strategy.interfaces;

public class HorseVoice implements VoiceBehavior{
    @Override
    public void voice() {
        System.out.println("Я ржу - Огогогого.");
    }
}
