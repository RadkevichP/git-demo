package pl.pingwit.classwork_19;

import java.util.*;

/**
 * @author Pavel Radkevich
 * @since 30.03.23
 */
public class MapExample {

    public static void main(String[] args) {
        Map<Car, String> cars = new HashMap<>();

        Car car = new Car("Audi", "A5");
        Car car1 = new Car("Audi", "A6");
        Car car2 = new Car("Audi", "A2");

        cars.put(car, "One");
        cars.put(car1, "Two");
        cars.put(car2, "Three");

        car.setBrand("VW");

        String s = cars.get(car);
        System.out.println(s);

        SortedMap<Car, String> sortedMap = new TreeMap<>(cars);
        for (Map.Entry<Car, String> carStringEntry : sortedMap.entrySet()) {

        }

    }
}
