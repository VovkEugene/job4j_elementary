package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchWeekTest {
    @Test
    void whenNameOfDayMonday() {
        int input = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNameOfDayTuesday() {
        int input = 2;
        String expected = "Вторник";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNameOfDayWednesday() {
        int input = 3;
        String expected = "Среда";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNameOfDayThursday() {
        int input = 4;
        String expected = "Четверг";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNameOfDayFriday() {
        int input = 5;
        String expected = "Пятница";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNameOfDaySaturday() {
        int input = 6;
        String expected = "Суббота";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNameOfDaySunday() {
        int input = 7;
        String expected = "Воскресенье";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNameOfDayInvalidZero() {
        int input = 0;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNameOfDayInvalidEight() {
        int input = 8;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNameOfDayInvalidNegative() {
        int input = -1;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(input);
        assertEquals(expected, actual);
    }

}