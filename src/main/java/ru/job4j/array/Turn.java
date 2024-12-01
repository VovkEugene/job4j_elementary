package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int length = array.length;
        int halfLength = length / 2;
        for (int i = 0; i < halfLength; i++) {
            swap(array, length, i);
        }
        return array;
    }

    private static void swap(int[] array, int arrayLength, int item) {
        int temp = array[item];
        array[item] = array[arrayLength - item - 1];
        array[arrayLength - item - 1] = temp;
    }
}
