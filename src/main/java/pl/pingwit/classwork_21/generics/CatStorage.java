package pl.pingwit.classwork_21.generics;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public class CatStorage {

    private CatPet[] storage;

    public CatStorage(CatPet[] storage) {
        this.storage = storage;
    }

    public CatPet[] getStorage() {
        return storage;
    }

    public void setStorage(CatPet[] storage) {
        this.storage = storage;
    }
}
