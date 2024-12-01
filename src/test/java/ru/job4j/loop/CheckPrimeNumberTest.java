package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.job4j.loop.CheckPrimeNumber.check;

class CheckPrimeNumberTest {

    @Test
    @DisplayName("Тестируемая ситуация: число равно 0. Ожидаемый результат: false")
    public void whenCheckZeroReturnsFalse() {
        int number = 0;
        boolean actual = check(number);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: число равно 1. Ожидаемый результат: false")
    public void whenCheckOneReturnsFalse() {
        int number = 1;
        boolean actual = check(number);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: число равно 2. Ожидаемый результат: true")
    public void whenCheckTwoReturnsTrue() {
        int number = 2;
        boolean actual = check(number);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: простое число. Ожидаемый результат: true")
    public void whenCheckPrimeNumberReturnsTrue() {
        int number = 17;
        boolean actual = check(number);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: составное число. Ожидаемый результат: false")
    public void whenCheckCompositeNumberReturnsFalse() {
        int number = 18;
        boolean actual = check(number);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: отрицательное число. Ожидаемый результат: false")
    public void whenCheckNegativeNumberReturnsFalse() {
        int number = -5;
        boolean actual = check(number);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: большое простое число. Ожидаемый результат: true")
    public void whenCheckLargePrimeNumberReturnsTrue() {
        int number = 997;
        boolean actual = check(number);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: большое составное число. Ожидаемый результат: false")
    public void whenCheckLargeCompositeNumberReturnsFalse() {
        int number = 1000;
        boolean actual = check(number);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: простое число 3. Ожидаемый результат: true")
    public void whenCheckThreeReturnsTrue() {
        int number = 3;
        boolean actual = check(number);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: простое число 5. Ожидаемый результат: true")
    public void whenCheckFiveReturnsTrue() {
        int number = 5;
        boolean actual = check(number);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: составное число 4. Ожидаемый результат: false")
    public void whenCheckFourReturnsFalse() {
        int number = 4;
        boolean actual = check(number);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Тестируемая ситуация: составное число 9. Ожидаемый результат: false")
    public void whenCheckNineReturnsFalse() {
        int number = 9;
        boolean actual = check(number);
        assertFalse(actual);
    }
}