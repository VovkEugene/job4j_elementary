package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.job4j.calculator.Fit.manWeight;
import static ru.job4j.calculator.Fit.womanWeight;

class FitTest {
    private static final float DELTA = 0.01F;

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double actual = manWeight(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double actual = womanWeight(input);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void whenManHeightZeroThenThrowsException() {
        short input = 0;
        assertThrows(IllegalArgumentException.class, () -> manWeight(input));
    }

    @Test
    void whenWomanHeightZeroThenThrowsException() {
        short input = 0;
        assertThrows(IllegalArgumentException.class, () -> womanWeight(input));
    }

    @Test
    void whenManHeightNegativeThenThrowsException() {
        short input = -10;
        assertThrows(IllegalArgumentException.class, () -> manWeight(input));
    }

    @Test
    void whenWomanHeightNegativeThenThrowsException() {
        short input = -10;
        assertThrows(IllegalArgumentException.class, () -> womanWeight(input));
    }
}