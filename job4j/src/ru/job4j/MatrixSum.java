package ru.job4j;

public class MatrixSum {

    public int sum(int[][] array) {
        int result = 0;
        for (int[] row : array) {
            for (int numb : row) {
                result += numb;
            }
        }
        return result;
    }
}
