package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeMaxTest {

    @Test
    void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int actual = ThreeMax.max(first, second, third);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int actual = ThreeMax.max(first, second, third);
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    void thirdMax() {
        int first = 1;
        int second = 5;
        int third = 100;
        int actual = ThreeMax.max(first, second, third);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int actual = ThreeMax.max(first, second, third);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int actual = ThreeMax.max(first, second, third);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void firstEqThird() {
        int first = 100;
        int second = 1;
        int third = 100;
        int actual = ThreeMax.max(first, second, third);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void secondEqThird() {
        int first = 1;
        int second = 100;
        int third = 100;
        int actual = ThreeMax.max(first, second, third);
        int expected = 100;
        assertEquals(expected, actual);
    }
}