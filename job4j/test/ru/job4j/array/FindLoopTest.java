package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop findValue = new FindLoop();
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = findValue.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6ThenNoIndex() {
        FindLoop findValue = new FindLoop();
        int[] input = {5, 4, 3, 2};
        int value = 1;
        int result = findValue.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}