package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = matrix.monoHorizontal(input, 1);
        assertTrue(result);
    }

    @Test
    public void whenDontHasMonoHorizontal() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '},
        };
        boolean result = matrix.monoHorizontal(input, 1);
        assertFalse(result);
    }

    @Test
    public void whenHasMonoVertical() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
        };
        boolean result = matrix.monoVertical(input, 0);
        assertTrue(result);
    }

    @Test
    public void whenDontHasMonoVertical() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {' ', ' ', ' '},
        };
        boolean result = matrix.monoVertical(input, 0);
        assertFalse(result);
    }

    @Test
    public void whenMatrixHasMonoDiagonal() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = matrix.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenMatrixHasNonMonoDiagonal() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', ' '},
        };
        char[] result = matrix.extractDiagonal(input);
        char[] expect = {'X', 'X', ' '};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        boolean result = matrix.isWin(input);
        assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        boolean result = matrix.isWin(input);
        assertFalse(result);
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = matrix.isWin(input);
        assertTrue(result);
    }

    @Test
    public void whenDataMonoMainDiagonalByTrueThenTrue() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', 'X'},
                {' ', ' ', 'X', 'X', ' '},
                {' ', ' ', 'X', ' ', 'X'},
        };
        boolean result = matrix.isWin(input);
        assertTrue(result);
    }

    @Test
    public void whenDataMonoMainDiagonalByTrueThenFalse() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', 'X'},
        };
        boolean result = matrix.isWin(input);
        assertFalse(result);
    }

    @Test
    public void whenMatrixHasMonoMainDiagonalByTrueThenTrue() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {'X', 'X', 'X', ' ', ' '},
                {' ', ' ', ' ', 'X', ' '},
                {' ', ' ', 'X', ' ', 'X'},
        };
        boolean result = matrix.monoMainDiagonal(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenMatrixHasMonoMainDiagonalByTrueThenFalse() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {'X', 'X', 'X', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', 'X'},
        };
        boolean result = matrix.monoMainDiagonal(input);
        assertFalse(result);
    }

    @Test
    public void whenMatrixHasMonoNotMainDiagonalByTrueThenTrue() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' ', ' ', 'X'},
                {' ', 'X', ' ', 'X', ' '},
                {'X', 'X', 'X', ' ', ' '},
                {' ', 'X', ' ', 'X', ' '},
                {'X', ' ', 'X', ' ', 'X'},
        };
        boolean result = matrix.monoNotMainDiagonal(input);
        assertTrue(result);
    }

    @Test
    public void whenMatrixHasMonoNotMainDiagonalByTrueThenFalse() {
        MatrixCheck matrix = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', 'X', ' '},
                {'X', 'X', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {'X', ' ', 'X', ' ', 'X'},
        };
        boolean result = matrix.monoNotMainDiagonal(input);
        assertFalse(result);
    }
}