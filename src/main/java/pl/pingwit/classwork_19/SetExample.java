package pl.pingwit.classwork_19;

import java.util.*;

/**
 * @author Pavel Radkevich
 * @since 30.03.23
 */
public class SetExample {

    public static void main(String[] args) {

        Car car = new Car("Audi", "A5");
        Car car1 = new Car("Audi", "A6");
        Car car2 = new Car("Audi", "A2");

        Set<Car> cars = new HashSet<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);

        Set<Car> cars1 = new TreeSet<>();
    }
}
