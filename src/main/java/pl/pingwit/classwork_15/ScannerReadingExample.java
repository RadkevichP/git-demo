package pl.pingwit.classwork_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 16.03.23
 */
public class ScannerReadingExample {

    public static void main(String[] args) {
        //File myObj = new File("/Users/pavelhomeair/Pingwit Course/git-demo/src/main/java/pl/pingwit/classwork_15/bad-romance.txt");
        //File myObj = new File("src/main/java/pl/pingwit/classwork_15/bad-romance.txt");
        File myObj = new File("src/main/java/pl/pingwit/classwork_15/img.png");
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
