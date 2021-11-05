package Patterns.StrategyPets.interfaces;

public class CatVoice implements VoiceBehavior{
    @Override
    public void voice() {
        System.out.println("Я издаю звуки - мяу, мяу, мяу");
    }
}
