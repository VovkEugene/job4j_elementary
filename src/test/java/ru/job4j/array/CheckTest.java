package ru.job4j.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckTest {
    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[]{true, true, true};
        boolean actual = Check.mono(data);
        assertTrue(actual);
    }

    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[]{true, false, true};
        boolean actual = Check.mono(data);
        assertFalse(actual);
    }

    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[]{false, false, false};
        boolean actual = Check.mono(data);
        assertTrue(actual);
    }

    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[]{false, true, false};
        boolean actual = Check.mono(data);
        assertFalse(actual);
    }

}