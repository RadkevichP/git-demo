package pl.pingwit.classwork_20.point_1;

import java.util.Comparator;

/**
 * @author Pavel Radkevich
 * @since 3.04.23
 */
public class AddressCityComparator implements Comparator<Address> {

    @Override
    public int compare(Address o1, Address o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
