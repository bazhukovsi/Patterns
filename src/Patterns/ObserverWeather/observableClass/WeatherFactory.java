package Patterns.ObserverWeather.observableClass;

import Patterns.ObserverWeather.interfaces.Observable;
import Patterns.ObserverWeather.interfaces.Observer;

import java.io.IOException;
import java.util.ArrayList;

public class WeatherFactory implements Observable {
    double temperatura;
    int pressure;
    ArrayList<Observer> observers = new ArrayList<>();
    public static ArrayList <Double> tempArray = new ArrayList<>();
    public static ArrayList <Integer> pressureArray = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setParametrsFactory(double temperatura, int pressure) throws IOException {
        this.temperatura = temperatura;
        this.pressure = pressure;
        tempArray.add(temperatura);
        pressureArray.add(pressure);
        notifyObserver(temperatura, pressure);
        System.out.println("=====================================================");
    }

    @Override
    public void notifyObserver(double temp, int pressure) throws IOException {
        for (Observer observer : observers){
            observer.update(temp, pressure);
        }
    }


}
