package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixTest {
    @Test
    public void when2on2() {
        int size = 2;
        int[][] actual = Matrix.multiple(size);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void when5on5() {
        int size = 5;
        int[][] actual = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        assertArrayEquals(expected, actual);
    }
}