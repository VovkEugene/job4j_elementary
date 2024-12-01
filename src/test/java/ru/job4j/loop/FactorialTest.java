package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.job4j.loop.Factorial.calculate;

class FactorialTest {

    @Test
    @DisplayName("Тестируемая ситуация: число равно 0. Ожидаемый результат: 1")
    public void whenCalculateZeroReturnsOne() {
        int number = 0;
        int expected = 1;
        int actual = calculate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: число равно 1. Ожидаемый результат: 1")
    public void whenCalculateOneReturnsOne() {
        int number = 1;
        int expected = 1;
        int actual = calculate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: положительное число. "
            + "Ожидаемый результат: факториал числа")
    public void whenCalculatePositiveNumberReturnsFactorial() {
        int number = 5;
        int expected = 120;
        int actual = calculate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: отрицательное число. "
            + "Ожидаемый результат: исключение IllegalArgumentException")
    public void whenCalculateNegativeNumberThrowsException() {
        int number = -1;
        assertThrows(IllegalArgumentException.class, () -> calculate(number));
    }

    @Test
    @DisplayName("Тестируемая ситуация: большое положительное число. "
            + "Ожидаемый результат: факториал числа")
    public void whenCalculateLargePositiveNumberReturnsFactorial() {
        int number = 10;
        int expected = 3628800;
        int actual = calculate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: число, факториал которого превышает Integer.MAXVALUE. "
            + "Ожидаемый результат: переполнение")
    public void whenCalculateNumberCausingOverflowReturnsOverflow() {
        int number = 13;
        int expected = 1932053504;
        int actual = calculate(number);
        assertEquals(expected, actual);
    }
}