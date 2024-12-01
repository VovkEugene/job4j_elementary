package ru.job4j.array;

public class MatrixCheck {

    public static boolean isWin(char[][] board) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            if (board[i][i] == 'X'
                    && (monoVertical(board, i) || monoHorizontal(board, i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}
