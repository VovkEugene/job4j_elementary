package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.job4j.array.MatrixCheck.monoHorizontal;
import static ru.job4j.array.MatrixCheck.monoVertical;

class MatrixCheckTest {

    @Test
    @DisplayName("Проверка наличия моно горизонтали")
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean actual = monoHorizontal(input, row);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка отсутствия моно горизонтали")
    public void whenNoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean actual = monoHorizontal(input, row);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Проверка наличия моно горизонтали в первой строке")
    public void whenFirstRowMonoHorizontal() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 0;
        boolean actual = monoHorizontal(input, row);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка наличия моно горизонтали в последней строке")
    public void whenLastRowMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
        };
        int row = 2;
        boolean actual = monoHorizontal(input, row);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка наличия моно горизонтали в неквадратной матрице")
    public void whenNonSquareMatrix() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {'X', 'X', 'X', 'X'},
        };
        int row = 2;
        boolean actual = monoHorizontal(input, row);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка наличия моно вертикали")
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
        };
        int column = 1;
        boolean actual = monoVertical(input, column);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка отсутствия моно вертикали")
    public void whenNoMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', ' ', ' '},
                {' ', 'X', ' '},
        };
        int column = 1;
        boolean actual = monoVertical(input, column);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Проверка наличия моно вертикали в первом столбце")
    public void whenFirstColumnMonoVertical() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
        };
        int column = 0;
        boolean actual = monoVertical(input, column);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка наличия моно вертикали в последнем столбце")
    public void whenLastColumnMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean actual = monoVertical(input, column);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка наличия моно вертикали в неквадратной матрице")
    public void whenNonSquareMatrixForMonoVertical() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
        };
        int column = 0;
        boolean actual = monoVertical(input, column);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка наличия моно вертикали с недопустимым индексом столбца")
    public void whenInvalidColumnIndex() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
        };
        int column = 3;
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> monoVertical(input, column),
                "Должно быть выброшено исключение ArrayIndexOutOfBoundsException");
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] actual = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        assertArrayEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] actual = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] actual = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean actual = MatrixCheck.isWin(input);
        assertTrue(actual);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean actual = MatrixCheck.isWin(input);
        assertFalse(actual);
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean actual = MatrixCheck.isWin(input);
        assertTrue(actual);
    }

    @Test
    public void whenDataDiagMonoIsTrueThenFalse() {
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X'},
        };
        boolean actual = MatrixCheck.isWin(input);
        assertFalse(actual);
    }
}