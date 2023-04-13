package pl.pingwit.classwork_8;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 16.02.23
 */
public class EnumPractice {

    public static void main(String[] args) {
        HouseType individual = HouseType.INDIVIDUAL;
        HouseType individual_house = HouseType.valueOf("INDIVIDUAL");

        System.out.println(individual_house);

        House house = new House(HouseType.INDIVIDUAL, 55, true);
        House house2 = new House(HouseType.INDIVIDUAL, 56, true);
        System.out.println(house.equals(house2));

    }
}
