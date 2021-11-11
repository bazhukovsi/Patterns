package Patterns.ObserverReader;

import Patterns.ObserverReader.interfaces.Observer;
import Patterns.ObserverReader.observable.Magazin;
import Patterns.ObserverReader.ovserver.ReaderMagazin;

import java.util.ArrayList;

public class MagazinTest {
    public static void main(String[] args) {
        Magazin magazin = new Magazin();

        magazin.addObserver(new ReaderMagazin("Бажукова Александра"));
        magazin.addObserver(new ReaderMagazin("Бажуков Сергей"));

        magazin.addBook("Три медведя");
        magazin.addBook("Три мушкетера");
        magazin.addBook("Три красавца");
        magazin.removeBook("Три медведя");


    }
}
