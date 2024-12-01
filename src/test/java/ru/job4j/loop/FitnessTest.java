package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FitnessTest {

    @Test
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int actual = Fitness.calc(ivan, nik);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int actual = Fitness.calc(ivan, nik);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int actual = Fitness.calc(ivan, nik);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int actual = Fitness.calc(ivan, nik);
        int expected = 1;
        assertEquals(expected, actual);
    }
}