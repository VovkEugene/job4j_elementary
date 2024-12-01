package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.job4j.array.RollBackArray.rollback;

class RollBackArrayTest {
    @Test
    public void whenEmpty() {
        int[] input = new int[]{};
        int[] expected = new int[]{};
        int[] actual = rollback(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenOne() {
        int[] input = new int[]{1};
        int[] expected = new int[]{1};
        int[] actual = rollback(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenFull() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{4, 3, 2, 1};
        int[] actual = rollback(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenTheSame() {
        int[] input = new int[]{1, 1, 1, 1};
        int[] expected = new int[]{1, 1, 1, 1};
        int[] actual = rollback(input);
        assertArrayEquals(expected, actual);
    }
}