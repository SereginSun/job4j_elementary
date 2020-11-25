package ru.job4j;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        MatrixSum matrix = new MatrixSum();
        int[][] input = {{10}};
        int expect = 10;
        int result = matrix.sum(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenDouble() {
        MatrixSum matrix = new MatrixSum();
        int[][] input = {{1, 2}, {2, 1}};
        int expect = 6;
        int result = matrix.sum(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenTriple() {
        MatrixSum matrix = new MatrixSum();
        int[][] input = {{1, 2, 3}, {2, 4, 6}, {0, 1, 7}};
        int expect = 26;
        int result = matrix.sum(input);
        assertThat(result, is(expect));
    }
}