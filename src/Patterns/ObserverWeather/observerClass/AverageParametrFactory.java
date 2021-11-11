package Patterns.ObserverWeather.observerClass;

import Patterns.ObserverWeather.interfaces.Observer;
import Patterns.ObserverWeather.observableClass.WeatherFactory;

import java.io.IOException;

public class AverageParametrFactory implements Observer {
    @Override
    public void update(double temp, int pressure) throws IOException {
        double sumTemp = 0.0;
        int sumPressure = 0;
        int count = WeatherFactory.tempArray.size();
        // Возьмем средние значения
        for (int i = 0; i < count; i++) {
            sumTemp += WeatherFactory.tempArray.get(i);
            sumPressure +=WeatherFactory.pressureArray.get(i);
        }
        System.out.println("Средняя температура после " + count + " измерений = " + sumTemp/count + "." );
        System.out.println("Среднее давление после " + count + " измерений = " + sumPressure/count + "." );
    }
}
