package Patterns.ObserverWeather.interfaces;

import java.io.IOException;

public interface Observer {
    public void update (double temp, int pressure) throws IOException;
}
