package Patterns.StrategyPets.interfaces;

public class VoiceCow implements VoiceBehavior{
    @Override
    public void voice() {
        System.out.println("Я умею мычать - му, му, му.");
    }
}
