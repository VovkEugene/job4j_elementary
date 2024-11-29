package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitTest {
    private static final float DELTA = 0.01F;

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double actual = Fit.manWeight(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double actual = Fit.womanWeight(input);
        assertEquals(expected, actual, DELTA);
    }
}