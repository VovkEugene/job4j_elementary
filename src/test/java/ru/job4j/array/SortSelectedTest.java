package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.job4j.array.SortSelected.sort;

class SortSelectedTest {
    @Test
    @DisplayName("Проверка сортировки массива из одного элемента")
    public void whenSortSingleElement() {
        int[] data = {1};
        int[] expected = {1};
        int[] actual = sort(data);
        assertArrayEquals(expected, actual,
                "Массив из одного элемента должен оставаться неизменным");
    }

    @Test
    @DisplayName("Проверка сортировки массива из трёх элементов")
    public void whenSortThreeElements() {
        int[] data = {1, 6, 4};
        int[] expected = {1, 4, 6};
        int[] actual = sort(data);
        assertArrayEquals(expected, actual,
                "Массив должен быть отсортирован по возрастанию");
    }

    @Test
    @DisplayName("Проверка сортировки уже отсортированного массива")
    public void whenSortAlreadySorted() {
        int[] data = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = sort(data);
        assertArrayEquals(expected, actual,
                "Отсортированный массив должен оставаться неизменным");
    }

    @Test
    @DisplayName("Проверка сортировки массива в обратном порядке")
    public void whenSortReverseOrder() {
        int[] data = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = sort(data);
        assertArrayEquals(expected, actual,
                "Массив должен быть отсортирован по возрастанию");
    }

    @Test
    @DisplayName("Проверка сортировки массива с дубликатами")
    public void whenSortWithDuplicates() {
        int[] data = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        int[] actual = sort(data);
        assertArrayEquals(expected, actual,
                "Массив с дубликатами должен быть отсортирован по возрастанию");
    }

    @Test
    @DisplayName("Проверка сортировки пустого массива")
    public void whenSortEmptyArray() {
        int[] data = {};
        int[] expected = {};
        int[] actual = sort(data);
        assertArrayEquals(expected, actual,
                "Пустой массив должен оставаться пустым");
    }

    @Test
    @DisplayName("Проверка сортировки массива с отрицательными числами")
    public void whenSortWithNegativeNumbers() {
        int[] data = {-3, -1, -4, -1, -5, -9, -2, -6, -5, -3, -5};
        int[] expected = {-9, -6, -5, -5, -5, -4, -3, -3, -2, -1, -1};
        int[] actual = sort(data);
        assertArrayEquals(expected, actual,
                "Массив с отрицательными числами должен быть отсортирован по возрастанию");
    }

    @Test
    @DisplayName("Проверка сортировки массива с нулевыми элементами")
    public void whenSortWithZeroes() {
        int[] data = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        int[] actual = sort(data);
        assertArrayEquals(expected, actual,
                "Массив с нулевыми элементами должен оставаться неизменным");
    }
}