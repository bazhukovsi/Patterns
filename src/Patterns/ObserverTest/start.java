package Patterns.ObserverTest;

import Patterns.ObserverTest.rezult.CurrentConditionDisplay;
import Patterns.ObserverTest.rezult.StatisticConditionDisplay;
import Patterns.ObserverTest.subjectRealization.WeatherData;

public class start {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticConditionDisplay statisticConditionDisplay = new StatisticConditionDisplay(weatherData);

        weatherData.setMesurements(80F, 65F, 30.4F);
        System.out.println("=================================================");
        weatherData.setMesurements(82F, 70F, 29.2F);
        System.out.println("=================================================");
        weatherData.setMesurements(78F, 90F, 29.2F);
        System.out.println("=================================================");

        for (Object weather : weatherData.getObservers()){
            System.out.println(weather.toString());
        }
    }
}
