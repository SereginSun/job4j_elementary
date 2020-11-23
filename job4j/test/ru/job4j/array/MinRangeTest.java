package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MinRangeTest {

    @Test
    public void whenFirstMin() {
        MinRange min = new MinRange();
        int[] input = {-2, 5, 0, 8, 9};
        int result = min.findMin(input, 0, 3);
        assertThat(result, is(-2));
    }

    @Test
    public void whenLastMin() {
        MinRange min = new MinRange();
        int[] input = {10, 5, 1, 3, 9};
        int result = min.findMin(input, 0, 2);
        assertThat(result, is(1));
    }

    @Test
    public void whenMiddleMin() {
        MinRange min = new MinRange();
        int[] input = {10, 1, 5, 3, 9};
        int result = min.findMin(input, 0, 2);
        assertThat(result, is(1));
    }
}