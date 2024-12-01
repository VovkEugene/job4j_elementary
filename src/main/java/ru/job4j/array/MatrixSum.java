package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int result = 0;
        for (int[] items : array) {
            for (int item : items) {
                result += item;
            }
        }
        return result;
    }
}
