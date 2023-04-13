package pl.pingwit.classwork_14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 13.03.23
 */
public class App {

    public static void main(String[] args) {
        String dataFromOtherSystem = "Pavel.Radkevich.01-1990-03.Ivan.Grin.07-1989-25";
        String[] split = dataFromOtherSystem.split("\\.");
        //StringUtils.split(dataFromOtherSystem, ".");
        System.out.println(Arrays.toString(split));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-yyyy-dd");

        for (int i = 0; i < split.length; i += 3) {
            String name = split[i];
            String surname = split[i + 1];
            String dateOfBirthString = split[i + 2];
            LocalDate d = LocalDate.parse(dateOfBirthString, dtf);
            Person person = new Person(name, surname, d);
            System.out.println(person);
        }
    }
}
