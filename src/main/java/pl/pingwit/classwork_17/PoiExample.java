package pl.pingwit.classwork_17;

import java.io.*;

/**
 * @author Pavel Radkevich
 * @since 23.03.23
 */
public class PoiExample {

    public static void main(String[] args) {

        File file = new File("src/main/java/pl/pingwit/classwork_17/pingwit.pl_анализ_конверсий.docx");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
