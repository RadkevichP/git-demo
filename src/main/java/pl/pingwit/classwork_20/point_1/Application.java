package pl.pingwit.classwork_20.point_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 3.04.23
 */
public class Application {

    public static void main(String[] args) {

        List<Address> addresses = new ArrayList<>();
        Address address = new Address();

        String s = "kjfn kfjk";
        Object s2 = s;
        System.out.println(s.contains(" "));
        System.out.println(s.matches("\\s"));

        addresses.sort(new AddressCityComparator());

        if (s2 instanceof Address) {
            Address s21 = (Address) s2;
            s21.getHouse();
        }

        Comparator<Address> addressComparator = Comparator.comparing(Address::getCity)
                .thenComparing(Address::getStreet)
                .thenComparingInt(Address::getHouse)
                .thenComparing(Address::getApartment, Comparator.reverseOrder())
                .reversed();


    }
}
