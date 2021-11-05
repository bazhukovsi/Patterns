package Patterns.ObserverTest.interfaces;

// Субъект

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
