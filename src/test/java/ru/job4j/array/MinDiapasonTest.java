package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.job4j.array.MinDiapason.findMin;

class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[]{-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int actual = findMin(array, start, finish);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int actual = findMin(array, start, finish);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int actual = findMin(array, start, finish);
        int expected = 2;
        assertEquals(expected, actual);
    }
}