package pl.pingwit.classwork_4;

import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 2.02.23
 */
public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hi, " + name + " " + age + " years old");
        scanner.close();
    }
}
