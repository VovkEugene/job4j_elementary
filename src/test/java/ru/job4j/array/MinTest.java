package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.job4j.array.Min.findMin;

class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[]{0, 5, 10};
        int actual = findMin(array);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 5, 3};
        int actual = findMin(array);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 2, 5};
        int actual = findMin(array);
        int expected = 2;
        assertEquals(expected, actual);
    }
}