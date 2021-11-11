package Patterns.ObserverWeather.observerClass;

import Patterns.ObserverWeather.interfaces.Observer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

public class FileObserver implements Observer {
    @Override
    public void update(double temp, int pressure) throws IOException {
        Path file = Files.createTempFile(null,null);
        String rezult = "Температура - " + temp + "; Давление " + pressure + ";";
        Files.write(file, Collections.singleton(rezult));
        System.out.println("Запись измерений в файл " + file.getParent() + "\\" +file.getFileName());

    }
}
