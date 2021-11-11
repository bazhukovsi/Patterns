package Patterns.ObserverReader.ovserver;

import Patterns.ObserverReader.interfaces.Observer;

import java.util.List;

public class ReaderMagazin implements Observer {

    private String name;

    public ReaderMagazin(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> books) {
        System.out.println("Дорогой подписчик, " + this.name + " !\n" +
                "в нашем магазине обновился ассоримент книг" + "\n"
                + books);
    }
}
