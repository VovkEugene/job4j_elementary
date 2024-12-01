package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.job4j.array.Square.calculate;

class SquareTest {

    @Test
    @DisplayName("Проверка метода с bound = 0")
    public void whenCalculateWithBoundZero() {
        int[] actual = calculate(0);
        assertArrayEquals(new int[]{}, actual, "Массив должен быть пустым");
    }

    @Test
    @DisplayName("Проверка метода с bound = 1")
    public void whenCalculateWithBoundOne() {
        int[] actual = calculate(1);
        assertArrayEquals(new int[]{0}, actual, "Массив должен содержать один элемент [0]");
    }

    @Test
    @DisplayName("Проверка метода с bound = 5")
    public void whenCalculateWithBoundFiveThen014916() {
        int[] actual = calculate(5);
        assertArrayEquals(new int[]{0, 1, 4, 9, 16}, actual, "Массив должен содержать квадраты чисел от 0 до 4");
    }

    @Test
    @DisplayName("Проверка метода с отрицательным bound")
    public void whenCalculateWithBoundNegative() {
        int[] actual = calculate(-5);
        assertArrayEquals(new int[]{}, actual, "Массив должен быть пустым");
    }

    @Test
    @DisplayName("Проверка метода с большим bound (1 миллион)")
    public void whenCalculateWithLargeBound() {
        int bound = 1000000;
        int[] actual = calculate(bound);
        assertEquals(bound, actual.length, "Длина массива должна быть равна bound");
        for (int i = 0; i < bound; i++) {
            assertEquals(i * i, actual[i], "Элемент массива должен быть квадратом индекса");
        }
    }
}