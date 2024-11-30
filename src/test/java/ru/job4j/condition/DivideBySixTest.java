package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideBySixTest {
    @Test
    void whenNumberDivideBy6() {
        int input = 24;
        String actual = DivideBySix.checkNumber(input);
        String expected = "The number divides by 6.";
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberDivideBy3AndNotEven() {
        int input = 9;
        String actual = DivideBySix.checkNumber(input);
        String expected = "The number divides by 3, but it isn't the even number.";
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberNoDivideBy3AndEven() {
        int input = 14;
        String actual = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divide by 3, but it is the even number.";
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberNoDivideBy3AndNotEven() {
        int input = 25;
        String actual = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divide by 3 and it isn't the even number.";
        assertEquals(expected, actual);
    }

}