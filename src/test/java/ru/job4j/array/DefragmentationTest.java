package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.job4j.array.Defragmentation.compress;
import static ru.job4j.array.Defragmentation.compress2Point;

class DefragmentationTest {

    @Test
    void whenOneFirst0() {
        int[] array = {0, 1};
        int[] actual = compress(array);
        int[] expected = {1, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenEmptyArray() {
        int[] array = {};
        int[] actual = compress(array);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] actual = compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] actual = compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] actual = compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenAll0() {
        int[] array = {0, 0, 0, 0};
        int[] actual = compress(array);
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] actual = compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] actual = compress(array);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, actual);
    }

    @Test
    void when2PointOneFirst0() {
        int[] array = {0, 1};
        int[] actual = compress2Point(array);
        int[] expected = {1, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void when2PointEmptyArray() {
        int[] array = {};
        int[] actual = compress2Point(array);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void when2PointNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] actual = compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void when2PointFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] actual = compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void when2PointFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] actual = compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void when2PointAll0() {
        int[] array = {0, 0, 0, 0};
        int[] actual = compress2Point(array);
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void when2PointSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] actual = compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void when2PointNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] actual = compress2Point(array);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, actual);
    }
}