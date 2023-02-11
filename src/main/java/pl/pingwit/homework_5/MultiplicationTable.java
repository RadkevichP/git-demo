package pl.pingwit.homework_5;

import java.util.Arrays;

/**
 * @author Pavel Radkevich
 * @since 8.02.23
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        int x = 9;
        int y = 9;

        int[][] table = new int[x][y];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
            System.out.println(Arrays.toString(table[i]));
        }
    }
}
