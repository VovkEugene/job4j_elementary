package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] < target) {
                left++;
            }
            if (array[left] + array[right] > target) {
                right--;
            }
            if (array[left] + array[right] == target) {
                return new int[]{left, right};
            }
        }
        return new int[0];
    }
}
