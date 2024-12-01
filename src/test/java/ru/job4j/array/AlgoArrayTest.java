package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.job4j.array.AlgoArray.bubbleSort;
import static ru.job4j.array.AlgoArray.swap;

class AlgoArrayTest {
    @Test
    @DisplayName("Проверка сортировки массива из одного элемента")
    public void whenBubbleSortSingleElement() {
        int[] input = {1};
        int[] expected = {1};
        int[] actual = bubbleSort(input);
        assertArrayEquals(expected, actual,
                "Массив из одного элемента должен оставаться неизменным");
    }

    @Test
    @DisplayName("Проверка сортировки уже отсортированного массива")
    public void whenBubbleSortAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = bubbleSort(input);
        assertArrayEquals(expected, actual,
                "Отсортированный массив должен оставаться неизменным");
    }

    @Test
    @DisplayName("Проверка сортировки массива в обратном порядке")
    public void whenBubbleSortReverseOrder() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = bubbleSort(input);
        assertArrayEquals(expected, actual,
                "Массив должен быть отсортирован по возрастанию");
    }

    @Test
    @DisplayName("Проверка сортировки массива с дубликатами")
    public void whenBubbleSortWithDuplicates() {
        int[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        int[] actual = bubbleSort(input);
        assertArrayEquals(expected, actual,
                "Массив с дубликатами должен быть отсортирован по возрастанию");
    }

    @Test
    @DisplayName("Проверка сортировки пустого массива")
    public void whenBubbleSortEmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] actual = bubbleSort(input);
        assertArrayEquals(expected, actual,
                "Пустой массив должен оставаться пустым");
    }

    @Test
    @DisplayName("Проверка сортировки массива с отрицательными числами")
    public void whenBubbleSortWithNegativeNumbers() {
        int[] input = {-3, -1, -4, -1, -5, -9, -2, -6, -5, -3, -5};
        int[] expected = {-9, -6, -5, -5, -5, -4, -3, -3, -2, -1, -1};
        int[] actual = bubbleSort(input);
        assertArrayEquals(expected, actual,
                "Массив с отрицательными числами должен быть отсортирован по возрастанию");
    }

    @Test
    @DisplayName("Проверка метода swap")
    public void whenSwap() {
        int[] array = {1, 2, 3, 4, 5};
        int i = 1;
        int j = 3;
        swap(array, i, j);
        assertArrayEquals(new int[]{1, 4, 3, 2, 5}, array,
                "Элементы должны поменяться местами");
    }

    @Test
    @DisplayName("Проверка метода swap с одинаковыми индексами")
    public void whenSwapSameIndices() {
        int[] array = {1, 2, 3, 4, 5};
        int i = 2;
        int j = 2;
        swap(array, i, j);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array,
                "Массив должен остаться неизменным");
    }

    @Test
    @DisplayName("Проверка метода swap с граничными индексами")
    public void whenSwapBoundaryIndices() {
        int[] array = {1, 2, 3, 4, 5};
        int i = 0;
        int j = 4;
        swap(array, i, j);
        assertArrayEquals(new int[]{5, 2, 3, 4, 1}, array,
                "Элементы должны поменяться местами");
    }

    @Test
    @DisplayName("Проверка метода swap с отрицательными индексами")
    public void whenSwapNegativeIndices() {
        int[] array = {1, 2, 3, 4, 5};
        int i = -1;
        int j = 2;
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> swap(array, i, j),
                "Должно быть выброшено исключение ArrayIndexOutOfBoundsException");
    }

    @Test
    @DisplayName("Проверка метода swap с индексами, выходящими за границы массива")
    public void whenSwapOutOfBoundsIndices() {
        int[] array = {1, 2, 3, 4, 5};
        int i = 0;
        int j = 5;
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> swap(array, i, j),
                "Должно быть выброшено исключение ArrayIndexOutOfBoundsException");
    }

}