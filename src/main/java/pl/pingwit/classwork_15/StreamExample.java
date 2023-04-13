package pl.pingwit.classwork_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Pavel Radkevich
 * @since 16.03.23
 */
public class StreamExample {

    public static void main(String[] args) {
        File file = new File("src/main/java/pl/pingwit/classwork_15/img.png");
        try {
            InputStream inputStream = new FileInputStream(file);
            int data = inputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
