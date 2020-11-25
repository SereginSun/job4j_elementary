package ru.job4j.array;

public class MatrixCheck {

    public boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}
