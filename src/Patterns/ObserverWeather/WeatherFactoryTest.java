package Patterns.ObserverWeather;

import Patterns.ObserverWeather.observableClass.WeatherFactory;
import Patterns.ObserverWeather.observerClass.AverageParametrFactory;
import Patterns.ObserverWeather.observerClass.ConsoleObserver;
import Patterns.ObserverWeather.observerClass.FileObserver;
import java.io.IOException;


public class WeatherFactoryTest {
    public static void main(String[] args) throws IOException {
        WeatherFactory weatherFactory = new WeatherFactory();
        weatherFactory.addObserver(new ConsoleObserver());
        weatherFactory.addObserver(new FileObserver());
        weatherFactory.addObserver(new AverageParametrFactory());
        weatherFactory.setParametrsFactory(25,760);
        weatherFactory.setParametrsFactory(35,770);
        weatherFactory.setParametrsFactory(28,730);
        weatherFactory.setParametrsFactory(30,710);
    }
}
