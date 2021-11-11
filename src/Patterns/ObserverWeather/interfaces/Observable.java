package Patterns.ObserverWeather.interfaces;

import java.io.IOException;

public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(double temp, int pressure) throws IOException;
}
