package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int actual = Max.max(left, right);
        assertEquals(expected, actual);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int expected = 2;
        int actual = Max.max(left, right);
        assertEquals(expected, actual);
    }

    @Test
    void whenBothEqual() {
        int left = 1;
        int right = 1;
        int expected = 1;
        int actual = Max.max(left, right);
        assertEquals(expected, actual);
    }
}