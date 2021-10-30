package Patterns.Strategy;

import Patterns.Strategy.abstracts.Car;
import Patterns.Strategy.objects.CarBMW;
import Patterns.Strategy.objects.CarJamesBond;
import Patterns.Strategy.objects.CarSEAT;

import java.util.ArrayList;
import java.util.List;

public class start {
    public static void main(String[] args) {
        List <Car> cars = new ArrayList<>();
        Car car1 = new CarBMW();
        Car car2 = new CarSEAT();
        Car car3 = new CarJamesBond();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        for (Car car : cars){
            car.display();
            System.out.println("----------------------------------------------------");
        }
    }
}
