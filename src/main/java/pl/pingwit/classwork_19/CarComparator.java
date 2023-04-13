package pl.pingwit.classwork_19;

import java.util.Comparator;

/**
 * @author Pavel Radkevich
 * @since 30.03.23
 */
public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
