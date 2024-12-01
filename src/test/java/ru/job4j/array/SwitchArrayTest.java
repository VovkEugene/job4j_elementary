package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.job4j.array.SwitchArray.swap;
import static ru.job4j.array.SwitchArray.swapBorder;

class SwitchArrayTest {

    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] actual = swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] actual = swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] actual = swapBorder(input);
        int[] expected = {3, 2, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] actual = swapBorder(input);
        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] actual = swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int destination = 2;
        int[] actual = swap(input, source, destination);
        int[] expected = {1, 3, 2, 4};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwap2to3() {
        int[] input = {1, 2, 3, 4};
        int source = 2;
        int destination = 3;
        int[] actual = swap(input, source, destination);
        int[] expected = {1, 2, 4, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwapMiddleElements() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int destination = 4;
        int[] actual = swap(input, source, destination);
        int[] expected = {1, 2, 5, 4, 3, 6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwapFirstAndMiddle() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int destination = 3;
        int[] actual = swap(input, source, destination);
        int[] expected = {4, 2, 3, 1, 5, 6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwapLastAndMiddle() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 5;
        int destination = 2;
        int[] actual = swap(input, source, destination);
        int[] expected = {1, 2, 6, 4, 5, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwapAdjacentElements() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 1;
        int destination = 2;
        int[] actual = swap(input, source, destination);
        int[] expected = {1, 3, 2, 4, 5, 6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenSwapNonAdjacentElements() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 1;
        int destination = 6;
        int[] actual = swap(input, source, destination);
        int[] expected = {1, 7, 3, 4, 5, 6, 2, 8};
        assertArrayEquals(expected, actual);
    }
}