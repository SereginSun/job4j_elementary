package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SkipNegativeTest {

    @Test
    public void whenSkipNegativeNumb() {
        SkipNegative changer = new SkipNegative();
        int[][] input = {{0, -1, -3}, {5, -5, 5}, {-10, 0, -8}};
        int[][] expect = {{0, 0, 0}, {5, 0, 5}, {0, 0, 0}};
        int[][] result = changer.skip(input);
        assertThat(result, is(expect));
    }
}