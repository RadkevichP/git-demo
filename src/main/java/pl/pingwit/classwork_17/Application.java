package pl.pingwit.classwork_17;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.*;

/**
 * @author Pavel Radkevich
 * @since 21.03.23
 */
public class Application {

    public static void main(String[] args) {
        Car car = new Car("Audi", "A4");

        ObjectMapper objectMapper = new ObjectMapper();
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/pl/pingwit/classwork_17/car.json"))) {
            byte[] bytes = objectMapper.writeValueAsBytes(car);
            bos.write(bytes);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/pl/pingwit/classwork_17/car.json"))) {
            byte[] bytes = bis.readAllBytes();
            ObjectReader objectReader = objectMapper.readerFor(Car.class);
            Car p = objectReader.readValue(bytes);
            System.out.println(p);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
