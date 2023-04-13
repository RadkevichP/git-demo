package pl.pingwit.classwork_15;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 16.03.23
 */
public class FileExample {

    public static void main(String[] args) {

        File file = new File("src/main/java/pl/pingwit/classwork_15");

        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(Arrays.toString(file.listFiles()));

        File file1 = new File("src/main/java/pl/pingwit/classwork_15/justpackage");
        boolean delete = file1.delete();

        File fileToCreate = new File("src/main/java/pl/pingwit/classwork_15/justpackage");

        fileToCreate.mkdir();


    }
}
