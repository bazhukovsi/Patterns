package Patterns.ObserverTest.rezult;

import Patterns.ObserverTest.interfaces.DisplayElement;
import Patterns.ObserverTest.interfaces.Observer;
import Patterns.ObserverTest.interfaces.Subject;

public class StatisticConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public StatisticConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }

    @Override
    public String toString() {
        return "StatisticConditionDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", weatherData=" + weatherData +
                '}';
    }

    @Override
    public void display() {
        System.out.println("Текущая статистика объекта: " + temperature + "C градусов , " + humidity + "% влажность , " +
                " давление " + pressure);
    }
}