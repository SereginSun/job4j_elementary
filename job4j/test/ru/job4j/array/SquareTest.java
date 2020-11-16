package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {

    @Test
    public void whenBoundIs4ThenCalculateArray0149() {
        Square square = new Square();
        int[] result = square.calculate(4);
        assertThat(result, is(new int[]{0, 1, 4, 9}));
    }

    @Test
    public void whenBoundIs6ThenCalculateArray01491625() {
        Square square = new Square();
        int[] result = square.calculate(6);
        assertThat(result, is(new int[]{0, 1, 4, 9, 16, 25}));
    }

    @Test
    public void whenBoundIs0ThenCalculateEmptyArray() {
        Square square = new Square();
        int[] result = square.calculate(0);
        assertThat(result, is(new int[0]));
    }
}