package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private static final float DELTA = 0.01F;

    @Test
    void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void when00toMinus30then3() {
        int x1 = 0;
        int y1 = 0;
        int x2 = -3;
        int y2 = 0;
        double expected = 3;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void when50to00then5() {
        int x1 = 5;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double expected = 5;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void when01to00then1() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 0;
        int y2 = 0;
        double expected = 1;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void whenMinus10to03then4Dot47() {
        int x1 = -2;
        int y1 = 0;
        int x2 = 0;
        int y2 = 4;
        double expected = 4.47;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, actual, DELTA);
    }

}