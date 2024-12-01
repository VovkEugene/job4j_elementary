package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TurnTest {

    @Test
    @DisplayName("Проверка переворота массива из одного элемента")
    public void whenBackSingleElement() {
        int[] array = {1};
        int[] expected = {1};
        int[] actual = Turn.back(array);
        assertArrayEquals(expected, actual, "Массив из одного элемента должен оставаться неизменным");
    }

    @Test
    @DisplayName("Проверка переворота массива из двух элементов")
    public void whenBackTwoElements() {
        int[] array = {1, 2};
        int[] expected = {2, 1};
        int[] actual = Turn.back(array);
        assertArrayEquals(expected, actual,
                "Массив из двух элементов должен быть перевернут");
    }

    @Test
    @DisplayName("Проверка переворота массива из нечетного числа элементов")
    public void whenBackOddElements() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = Turn.back(array);
        assertArrayEquals(expected, actual,
                "Массив из нечетного числа элементов должен быть перевернут");
    }

    @Test
    @DisplayName("Проверка переворота массива из четного числа элементов")
    public void whenBackEvenElements() {
        int[] array = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        int[] actual = Turn.back(array);
        assertArrayEquals(expected, actual,
                "Массив из четного числа элементов должен быть перевернут");
    }

    @Test
    @DisplayName("Проверка переворота пустого массива")
    public void whenBackEmptyArray() {
        int[] array = {};
        int[] expected = {};
        int[] actual = Turn.back(array);
        assertArrayEquals(expected, actual,
                "Пустой массив должен оставаться пустым");
    }

    @Test
    @DisplayName("Проверка переворота массива с отрицательными числами")
    public void whenBackNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int[] expected = {-5, -4, -3, -2, -1};
        int[] actual = Turn.back(array);
        assertArrayEquals(expected, actual,
                "Массив с отрицательными числами должен быть перевернут");
    }

    @Test
    @DisplayName("Проверка переворота массива с повторяющимися элементами")
    public void whenBackDuplicateElements() {
        int[] array = {1, 2, 2, 3, 3, 3};
        int[] expected = {3, 3, 3, 2, 2, 1};
        int[] actual = Turn.back(array);
        assertArrayEquals(expected, actual,
                "Массив с повторяющимися элементами должен быть перевернут");
    }
}