package pl.pingwit.classwork_21.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public class Main {

    public static void main(String[] args) {
        GenericStorage<Pet> catPetGenericStorage = new GenericStorage<>(new CatPet[]{});

        for (Pet catPet : catPetGenericStorage.getStorage()) {

        }
        List<CatPet> catPets = new ArrayList<>();
        printPetNames(catPets);

    }

    public static void printPetNames(List<? extends Pet> pets) {
        for (Pet pet : pets) {
            System.out.println(pet.getName());
        }
    }
}
