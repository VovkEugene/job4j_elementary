package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.job4j.array.FindLoop.indexInRange;
import static ru.job4j.array.FindLoop.indexOf;

class FindLoopTest {

    @Test
    @DisplayName("Проверка нахождения элемента в массиве")
    public void whenIndexOfElementFound() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 3;
        int expected = 2;
        int actual = indexOf(data, element);
        assertEquals(expected, actual,
                "Элемент должен быть найден на индексе 2");
    }

    @Test
    @DisplayName("Проверка отсутствия элемента в массиве")
    public void whenIndexOfElementNotFound() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 6;
        int expected = -1;
        int actual = indexOf(data, element);
        assertEquals(expected, actual,
                "Элемент не должен быть найден, возвращаем -1");
    }

    @Test
    @DisplayName("Проверка нахождения элемента в пустом массиве")
    public void whenIndexOfElementInEmptyArray() {
        int[] data = {};
        int element = 1;
        int expected = -1;
        int actual = indexOf(data, element);
        assertEquals(expected, actual,
                "Элемент не должен быть найден в пустом массиве, возвращаем -1");
    }

    @Test
    @DisplayName("Проверка нахождения первого элемента в массиве")
    public void whenIndexOfFirstElement() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 1;
        int expected = 0;
        int actual = indexOf(data, element);
        assertEquals(expected, actual,
                "Первый элемент должен быть найден на индексе 0");
    }

    @Test
    @DisplayName("Проверка нахождения последнего элемента в массиве")
    public void whenIndexOfLastElement() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 5;
        int expected = 4;
        int actual = indexOf(data, element);
        assertEquals(expected, actual,
                "Последний элемент должен быть найден на индексе 4");
    }

    @Test
    @DisplayName("Проверка нахождения элемента в массиве с дубликатами")
    public void whenIndexOfElementWithDuplicates() {
        int[] data = {1, 2, 3, 3, 4, 5};
        int element = 3;
        int expected = 2;
        int actual = indexOf(data, element);
        assertEquals(expected, actual,
                "Первое вхождение элемента должно быть найдено на индексе 2");
    }

    @Test
    @DisplayName("Проверка нахождения элемента в диапазоне")
    public void whenIndexInRangeFound() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 3;
        int start = 1;
        int finish = 4;
        int expected = 2;
        int actual = indexInRange(data, element, start, finish);
        assertEquals(expected, actual,
                "Элемент должен быть найден в диапазоне");
    }

    @Test
    @DisplayName("Проверка отсутствия элемента в диапазоне")
    public void whenIndexInRangeNotFound() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 6;
        int start = 0;
        int finish = 4;
        int expected = -1;
        int actual = indexInRange(data, element, start, finish);
        assertEquals(expected, actual,
                "Элемент не должен быть найден в диапазоне");
    }

    @Test
    @DisplayName("Проверка нахождения элемента в начале диапазона")
    public void whenIndexInRangeStart() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 2;
        int start = 1;
        int finish = 4;
        int expected = 1;
        int actual = indexInRange(data, element, start, finish);
        assertEquals(expected, actual,
                "Элемент должен быть найден в начале диапазона");
    }

    @Test
    @DisplayName("Проверка нахождения элемента в конце диапазона")
    public void whenIndexInRangeEnd() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 4;
        int start = 1;
        int finish = 4;
        int expected = 3;
        int actual = indexInRange(data, element, start, finish);
        assertEquals(expected, actual,
                "Элемент должен быть найден в конце диапазона");
    }

    @Test
    @DisplayName("Проверка нахождения элемента в пустом диапазоне")
    public void whenIndexInRangeEmptyRange() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 3;
        int start = 2;
        int finish = 2;
        int expected = -1;
        int actual = indexInRange(data, element, start, finish);
        assertEquals(expected, actual,
                "Элемент не должен быть найден в пустом диапазоне");
    }

    @Test
    @DisplayName("Проверка нахождения элемента в диапазоне с одним элементом")
    public void whenIndexInRangeSingleElement() {
        int[] data = {1, 2, 3, 4, 5};
        int element = 3;
        int start = 2;
        int finish = 3;
        int expected = 2;
        int actual = indexInRange(data, element, start, finish);
        assertEquals(expected, actual,
                "Элемент должен быть найден в диапазоне с одним элементом");
    }

    @Test
    @DisplayName("Проверка нахождения элемента в диапазоне с отрицательными числами")
    public void whenIndexInRangeNegativeNumbers() {
        int[] data = {-5, -4, -3, -2, -1};
        int element = -3;
        int start = 1;
        int finish = 4;
        int expected = 2;
        int actual = indexInRange(data, element, start, finish);
        assertEquals(expected, actual,
                "Элемент должен быть найден в диапазоне с отрицательными числами");
    }

    @Test
    @DisplayName("Проверка нахождения элемента в диапазоне с повторяющимися элементами")
    public void whenIndexInRangeDuplicateElements() {
        int[] data = {1, 2, 3, 3, 4, 5};
        int element = 3;
        int start = 1;
        int finish = 5;
        int expected = 2;
        int actual = indexInRange(data, element, start, finish);
        assertEquals(expected, actual,
                "Элемент должен быть найден в диапазоне с повторяющимися элементами");
    }
}