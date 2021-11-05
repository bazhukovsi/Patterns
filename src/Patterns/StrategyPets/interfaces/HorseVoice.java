package Patterns.StrategyPets.interfaces;

public class HorseVoice implements VoiceBehavior{
    @Override
    public void voice() {
        System.out.println("Умею ржать - Огого, Огого, Огого.");
    }
}
