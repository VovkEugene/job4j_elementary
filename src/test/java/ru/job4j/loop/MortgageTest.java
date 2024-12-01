package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MortgageTest {

    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int actual = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void whenAmount100Salary120Percent50ThenYear2() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int actual = Mortgage.year(amount, salary, percent);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void whenAmount1000Salary1200Percent20ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 20;
        int actual = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertEquals(expected, actual);
    }
}