package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MinTest {

    @Test
    public void whenFirstMin() {
        Min min = new Min();
        int[] input = {1, 5, 7};
        int result = min.findMin(input);
        assertThat(result, is(1));
    }

    @Test
    public void whenLastMin() {
        Min min = new Min();
        int[] input = {4, 5, 2};
        int result = min.findMin(input);
        assertThat(result, is(2));
    }

    @Test
    public void whenMiddleMin() {
        Min min = new Min();
        int[] input = {8, 5, 9};
        int result = min.findMin(input);
        assertThat(result, is(5));
    }
}