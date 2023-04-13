package pl.pingwit.classwork_12;

import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 6.03.23
 */
public class App {

    public static void main(String[] args) {
        RandomUtils.nextBoolean();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int divident = scanner.nextInt();
            try {
                int result = 10 / divident;
                System.out.println(result);
            } catch (ArithmeticException exception) {
                String message = exception.getMessage();
                System.out.printf("Exception occurred: %s", message);
            }
        }
    }
}
