package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.job4j.condition.LogicNot.evenOrNegative;
import static ru.job4j.condition.LogicNot.isEven;
import static ru.job4j.condition.LogicNot.isNegative;
import static ru.job4j.condition.LogicNot.isPositive;
import static ru.job4j.condition.LogicNot.notEven;
import static ru.job4j.condition.LogicNot.notEvenAndPositive;

class LogicNotTest {

    @Test
    void whenIsEvenTrue() {
        int input = 2;
        boolean actual = isEven(input);
        assertTrue(actual);
    }

    @Test
    void whenIsEvenFalse() {
        int input = 3;
        boolean actual = isEven(input);
        assertFalse(actual);
    }

    @Test
    void whenIsPositiveTrue() {
        int input = 2;
        boolean actual = isPositive(input);
        assertTrue(actual);
    }

    @Test
    void whenIsPositiveFalse() {
        int input = -2;
        boolean actual = isPositive(input);
        assertFalse(actual);
    }

    @Test
    void wheninputIs0IsPositiveFalse() {
        int input = 0;
        boolean actual = isPositive(input);
        assertFalse(actual);
    }

    @Test
    void whenNotEvenFalse() {
        int input = 2;
        boolean actual = notEven(input);
        assertFalse(actual);
    }

    @Test
    void whenNotEvenTrue() {
        int input = 3;
        boolean actual = notEven(input);
        assertTrue(actual);
    }

    @Test
    void whenNegativeTrue() {
        int input = -2;
        boolean actual = isNegative(input);
        assertTrue(actual);
    }

    @Test
    void whenNegativeFalse() {
        int input = 2;
        boolean actual = isNegative(input);
        assertFalse(actual);
    }

    @Test
    void wheninputIs0NegativeFalse() {
        int input = 0;
        boolean actual = isNegative(input);
        assertFalse(actual);
    }

    @Test
    void whenNotEvenAndPositiveIsTrue() {
        int input = 3;
        boolean actual = notEvenAndPositive(input);
        assertTrue(actual);
    }

    @Test
    void whenNotEvenFalseIsAllFalse() {
        int input = 2;
        boolean actual = notEvenAndPositive(input);
        assertFalse(actual);
    }

    @Test
    void whenPositiveFalseIsAllFalse() {
        int input = -3;
        boolean actual = notEvenAndPositive(input);
        assertFalse(actual);
    }

    @Test
    void whenNotEvenAndPositiveIsFalse() {
        int input = 0;
        boolean actual = notEvenAndPositive(input);
        assertFalse(actual);
    }

    @Test
    void whenEvenOrNegativeIsTrue() {
        int input = -2;
        boolean actual = evenOrNegative(input);
        assertTrue(actual);
    }

    @Test
    void whenEvenIsTrueThenAllIsTrue() {
        int input = 2;
        boolean actual = evenOrNegative(input);
        assertTrue(actual);
    }

    @Test
    void whenNegativeIsTrueThenAllIsTrue() {
        int input = -3;
        boolean actual = evenOrNegative(input);
        assertTrue(actual);
    }

    @Test
    void whenEvenOrNegativeIsFalse() {
        int input = 3;
        boolean actual = evenOrNegative(input);
        assertFalse(actual);
    }
}