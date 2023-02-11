package pl.pingwit.homework_5;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 8.02.23
 */
public class ArrayInversion {

    public static void main(String[] args) {

        int[] numbers = new int[]{9, 8, 7, 6, 5, 4,};
        int[] inverted = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int invertedIndex = (inverted.length -1) - i;
            inverted[invertedIndex] = numbers[i];
        }
        System.out.println(Arrays.toString(inverted));
    }
}
