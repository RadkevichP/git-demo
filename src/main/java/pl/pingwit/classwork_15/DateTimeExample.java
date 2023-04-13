package pl.pingwit.classwork_15;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

/**
 * @author Pavel Radkevich
 * @since 15.03.23
 */
public class DateTimeExample {

    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2022, 12, 12);


        long betweenMonths = YEARS.between(data, LocalDate.now());

    }
}
