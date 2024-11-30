package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.job4j.condition.MultipleSwitchWeek.numberOfDay;

class MultipleSwitchWeekTest {

    @Test
    void whenNumberOfDayMonday() {
        String input = "Monday";
        int expected = 1;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayTuesday() {
        String input = "Tuesday";
        int expected = 2;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayWednesday() {
        String input = "Wednesday";
        int expected = 3;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayThursday() {
        String input = "Thursday";
        int expected = 4;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayFriday() {
        String input = "Friday";
        int expected = 5;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDaySaturday() {
        String input = "Saturday";
        int expected = 6;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDaySunday() {
        String input = "Sunday";
        int expected = 7;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayInvalid() {
        String input = "InvalidDay";
        int expected = -1;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayRussianMonday() {
        String input = "Понедельник";
        int expected = 1;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayRussianTuesday() {
        String input = "Вторник";
        int expected = 2;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayRussianWednesday() {
        String input = "Среда";
        int expected = 3;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayRussianThursday() {
        String input = "Четверг";
        int expected = 4;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayRussianFriday() {
        String input = "Пятница";
        int expected = 5;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayRussianSaturday() {
        String input = "Суббота";
        int expected = 6;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenNumberOfDayRussianSunday() {
        String input = "Воскресенье";
        int expected = 7;
        int actual = numberOfDay(input);
        assertEquals(expected, actual);
    }

}