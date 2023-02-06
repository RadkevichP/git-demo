package pl.pingwit.homework_2;

/**
 * @author Pavel Radkevich
 * @since 28.01.23
 */
public class Task1 {

    public static void main(String[] args) {
        if (firstCheck() || secondCheck()) {
            System.out.println();
            System.out.println("Доступ разрешен!");
        }
    }

    private static boolean firstCheck() {
        System.out.println("Первая проверка, введите пароль");
        return true;
    }

    private static boolean secondCheck() {
        System.out.println("Вторая проверка, сканируем сетчатку");
        return false;
    }
}
