package pl.pingwit.homework_4;

import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 4.02.23
 */
public class Butterfly {

    /*
    Нарисовать на консоли бабочку.
    При запуске программы пользователя просят ввести размер бабочки и затем программа выводит результат на экран.
    Пример вывода в butterfly.png
     */
    public static void main(String[] args) {


        int size = 5;
        for (int row = 1; row <= size - 1; row++) {                   // вывод верхней части бабочки, не включая средний ряд

            for (int number = 1; number <= row; number++)             //вывод цифр слева
                System.out.print(number);

            for (int space = 1; space <= 2 * (size - row); space++)   // вывод пробелов между цифрами
                System.out.print(" ");

            for (int number = row; number >= 1; number--)             // вывод цифр справа
                System.out.print(number);

            System.out.println();                                //переход на новую строку
        }
        for (int row = size; row >= 1; row--) {                       // вывод нижней части бабочки, включая средний ряд

            for (int digit = 1; digit <= row; digit++)            // выводим цифры слева
                System.out.print(digit);

            for (int space = 1; space <= 2 * (size - row); space++)    // выводим пробелы
                System.out.print(" ");

            for (int digit = row; digit >= 1; digit--)             // выводим цифры справа
                System.out.print(digit);

            System.out.println();
        }

    }

}



