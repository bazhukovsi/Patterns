package Patterns.StrategyCar;

import Patterns.StrategyCar.abstracts.Car;
import Patterns.StrategyCar.flyBehaviorClass.CarNoFly;
import Patterns.StrategyCar.flyBehaviorClass.CarWithFantasticPerfom;
import Patterns.StrategyCar.flyBehaviorClass.CarWithWings;
import Patterns.StrategyCar.objects.CarBMW;
import Patterns.StrategyCar.objects.CarJamesBond;
import Patterns.StrategyCar.objects.CarSEAT;
import Patterns.StrategyCar.objects.FantasticCar;

import java.util.ArrayList;
import java.util.List;

public class start {
    public static void main(String[] args) {
        List <Car> cars = new ArrayList<>();
        Car car1 = new CarBMW();
        car1.setFlyBehavior(new CarNoFly());
        Car car2 = new CarSEAT();
        car2.setFlyBehavior(new CarNoFly());
        Car car3 = new CarJamesBond();
        car3.setFlyBehavior(new CarWithWings());
        Car car4 = new FantasticCar();
        car4.setFlyBehavior(new CarWithFantasticPerfom());
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        for (Car car : cars){
            car.display();
            car.perfomFly();
            System.out.println("----------------------------------------------------");
        }
    }
}
