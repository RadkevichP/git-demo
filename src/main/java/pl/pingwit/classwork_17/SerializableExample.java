package pl.pingwit.classwork_17;

import java.io.*;

/**
 * @author Pavel Radkevich
 * @since 22.03.23
 */
public class SerializableExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car fabia = new Car("Skoda", "Fabia");
        fabia.setStatus("good");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/java/pl/pingwit/classwork_17/fabia"));

        objectOutputStream.writeObject(fabia);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/java/pl/pingwit/classwork_17/fabia"));
        Car fakeCar = (Car) objectInputStream.readObject();
        System.out.println(fakeCar);
    }
}
