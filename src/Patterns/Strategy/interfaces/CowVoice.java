package Patterns.Strategy.interfaces;

public class CowVoice implements VoiceBehavior {
    @Override
    public void voice() {
        System.out.println("Я мычу - Му,Му,Му.");
    }
}
