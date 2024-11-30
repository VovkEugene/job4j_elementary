package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest {

    @Test
    void whenTriangleExists() {
        assertTrue(Triangle.exist(3, 4, 5));
        assertTrue(Triangle.exist(5, 5, 5));
        assertTrue(Triangle.exist(3, 4, 6));
    }

    @Test
    void whenTriangleDoesNotExist() {
        assertFalse(Triangle.exist(1, 2, 3));
        assertFalse(Triangle.exist(1, 1, 3));
        assertFalse(Triangle.exist(0, 0, 0));
        assertFalse(Triangle.exist(-1, 2, 3));
    }

    @Test
    void whenBoundaryConditions() {
        assertTrue(Triangle.exist(1, 1, 1));
        assertFalse(Triangle.exist(1, 1, 2));
        assertFalse(Triangle.exist(1, 1, 3));
    }

    @Test
    void whenLargeValues() {
        assertTrue(Triangle.exist(1000, 1000, 1000));
        assertFalse(Triangle.exist(1000, 1, 1));
    }

}