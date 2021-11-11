package Patterns.ObserverReader.observable;

import Patterns.ObserverReader.interfaces.Observable;
import Patterns.ObserverReader.interfaces.Observer;
import Patterns.ObserverReader.ovserver.ReaderMagazin;

import java.util.ArrayList;

public class Magazin implements Observable {
    ArrayList<Observer> observers = new ArrayList<>();
    ArrayList<String> books = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addBook(String book){
        books.add(book);
        notifyObserver();
    }

    public void removeBook(String book){
        books.remove(book);
        notifyObserver();
    }


    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(books);
        }
    }
}
