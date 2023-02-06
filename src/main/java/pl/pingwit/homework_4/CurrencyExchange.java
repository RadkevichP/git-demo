package pl.pingwit.homework_4;

import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 3.02.23
 */
public class CurrencyExchange {

    public static void main(String[] args) {

        String eurCode = "eur";
        String uahCode = "uah";

        double eurToUahRate = 40.0;
        double uahToEurRate = 0.025;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Наш обменник позволяет поменять гривны на евро, либо евро на гривны");
        System.out.println("Введите код валюты, которую вы сдаете: eur или uah");
        String currencyCode = scanner.next();

        System.out.println("Введите сумму");
        double toExchange = scanner.nextDouble();

        if (currencyCode.equals(eurCode)) {
            double result = toExchange * eurToUahRate;
            System.out.println("Возьмите ваши " + result + " гривен");
        } else if (currencyCode.equals(uahCode)) {
            double result = toExchange * uahToEurRate;
            System.out.println("Возьмите ваши " + result + " евро");
        } else {
            System.out.println("Данная валюта не поддерживается: " + currencyCode);
        }

    }
}

/*
Task 1
Написать программу-конвертер валют. (гривна <-> евро в обе стороны)
Пользователь вводит валюту первым шагом, вторым вводит сумму, на выходе получает сумму в другой валюте.

Пример:
       Введите валюту:
       eur
       Введите сумму:
       20
       К выдаче 800 гривен

       Введите валюту:
       uah
       Введите сумму:
       800
       К выдаче 40 евро

Если пользователь ввел не eur и не uah, вывести сообщение "валюта хх не поддерживается" и завершить выполнение программы
 */
















