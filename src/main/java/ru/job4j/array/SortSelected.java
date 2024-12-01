package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {
        int length = data.length;
        for (int i = 0; i < length; i++) {
            int minIndex = getMinIndex(data, i, length);
            if (i != minIndex) {
                swap(data, i, minIndex);
            }
        }
        return data;
    }

    private static void swap(int[] data, int first, int second) {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    private static int getMinIndex(int[] array, int start, int finish) {
        int min = start;
        for (int i = start; i < finish; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {6, 8, 2, 2, 1, 4, 1, 0};
        System.out.println(Arrays.toString(sort(array)));
    }
}
