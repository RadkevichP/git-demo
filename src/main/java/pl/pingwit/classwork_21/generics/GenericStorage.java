package pl.pingwit.classwork_21.generics;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public class GenericStorage<T extends Pet> {

    private T[] storage;

    public GenericStorage(T[] storage) {
        this.storage = storage;
    }

    public T[] getStorage() {
        return storage;
    }

    public void setStorage(T[] storage) {
        this.storage = storage;
    }
}
