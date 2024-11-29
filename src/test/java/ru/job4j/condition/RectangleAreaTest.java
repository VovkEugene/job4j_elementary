package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleAreaTest {
    private static final float DELTA = 0.01F;

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double actual = RectangleArea.square(p, k);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void whenP5K4Square1() {
        int expected = 1;
        int p = 5;
        double k = 4;
        double actual = RectangleArea.square(p, k);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void whenP10K1Square6Dot25() {
        double expected = 6.25;
        int p = 10;
        double k = 1;
        double actual = RectangleArea.square(p, k);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void whenP18K4Square12Dot96() {
        double expected = 12.96;
        int p = 18;
        double k = 4;
        double actual = RectangleArea.square(p, k);
        assertEquals(expected, actual, DELTA);
    }
}