package pl.pingwit.classwork_13;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;

/**
 * @author Pavel Radkevich
 * @since 9.03.23
 */
public class Service {

    public byte[] loadPhoto() throws PavelException {
        if (RandomUtils.nextBoolean()) {
            throw new PavelException("Error connecting to the photo");
        } else {
            System.out.println("Загрузили фото");
            return RandomUtils.nextBytes(50);
        }
    }

    public byte[] editPhoto(byte[] photo) {
        throw new PavelRuntimeException("Error editing the photo");
    }

    public String generateReport(String employee) throws IOException {
        System.out.println("Connecting to the DataBase.........");
        if (RandomUtils.nextBoolean()) {
            throw new IOException("Failed to connect to the database");
        }
        return String.format("%s, your salary is 60000$", employee);
    }
}
