package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {
    @Test
    public void whenSumStartEqualsFinishReturnsStart() {
        int start = 5;
        int finish = 5;
        int expected = 5;
        int actual = Counter.sum(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumStartLessThanFinishReturnsSum() {
        int start = 1;
        int finish = 5;
        int expected = 15;
        int actual = Counter.sum(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumStartGreaterThanFinishReturnsZero() {
        int start = 10;
        int finish = 5;
        int expected = 0;
        int actual = Counter.sum(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumNegativeNumbersReturnsSum() {
        int start = -5;
        int finish = -1;
        int expected = -15;
        int actual = Counter.sum(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumMixedSignNumbersReturnsSum() {
        int start = -2;
        int finish = 3;
        int expected = 3;
        int actual = Counter.sum(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumLargeNumbersReturnsSum() {
        int start = 1000;
        int finish = 1005;
        int expected = 6015;
        int actual = Counter.sum(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumZeroStartReturnsSum() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int actual = Counter.sum(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumZeroFinishReturnsZero() {
        int start = -3;
        int finish = 0;
        int expected = -6;
        int actual = Counter.sum(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumByEvenStartEqualsFinishEvenReturnsStart() {
        int start = 4;
        int finish = 4;
        int expected = 4;
        int actual = Counter.sumByEven(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumByEvenStartEqualsFinishOddReturnsZero() {
        int start = 5;
        int finish = 5;
        int expected = 0;
        int actual = Counter.sumByEven(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumByEvenStartLessThanFinishEvenReturnsSum() {
        int start = 1;
        int finish = 6;
        int expected = 12;
        int actual = Counter.sumByEven(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumByEvenStartGreaterThanFinishReturnsZero() {
        int start = 10;
        int finish = 5;
        int expected = 0;
        int actual = Counter.sumByEven(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumByEvenNegativeNumbersEvenReturnsSum() {
        int start = -6;
        int finish = -2;
        int expected = -12;
        int actual = Counter.sumByEven(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenStartMinus3Finish4Return4() {
        int start = -3;
        int finish = 4;
        int expected = 4;
        int actual = Counter.sumByEven(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumByEvenLargeNumbersEvenReturnsSum() {
        int start = 1000;
        int finish = 1006;
        int expected = 4012;
        int actual = Counter.sumByEven(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumByEvenZeroStartReturnsSum() {
        int start = 0;
        int finish = 5;
        int expected = 6;
        int actual = Counter.sumByEven(start, finish);
        assertEquals(expected, actual);
    }

    @Test
    public void whenStartMinus3FinishZeroReturnsMinus2() {
        int start = -3;
        int finish = 0;
        int expected = -2;
        int actual = Counter.sumByEven(start, finish);
        assertEquals(expected, actual);
    }
}