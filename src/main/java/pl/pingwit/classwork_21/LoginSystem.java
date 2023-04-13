package pl.pingwit.classwork_21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public class LoginSystem {

    public static void main(String[] args) {

        Map<String, String> users = new HashMap<>();
        users.put("ttt", "popop");
        users.put("ppp", "popop");
        users.put("sss", "popop");
        users.put("qqq", "popop");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("добро пожаловать, введите имя...");
            String username = scanner.nextLine();
            if (username.equals("exit")) {
                break;
            }
            if (users.containsKey(username)){
                System.out.println("введите пароль");
                scanner.nextLine();

                System.out.println("welcome");
            } else {
                System.out.println("такого юзера нет");
            }

        }
    }
}
