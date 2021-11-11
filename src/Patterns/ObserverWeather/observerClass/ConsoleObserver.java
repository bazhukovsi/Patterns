package Patterns.ObserverWeather.observerClass;

import Patterns.ObserverWeather.interfaces.Observer;

public class ConsoleObserver implements Observer {
    @Override
    public void update(double temp, int pressure) {
        System.out.println("Температура - " + temp + "; Давление " + pressure + ";");
    }
}
