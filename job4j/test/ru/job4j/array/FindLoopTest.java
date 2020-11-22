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

    @Test
    public void whenArrayHas2Then3() {
        FindLoop findValue = new FindLoop();
        int[] input = {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = findValue.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayDoesNotHave3ThenNoIndex() {
        FindLoop findValue = new FindLoop();
        int[] input = {5, 1, 10, 2, 4};
        int value = 3;
        int start = 1;
        int finish = 3;
        int result = findValue.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenStartOutOfBoundThenNoIndex() {
        FindLoop findValue = new FindLoop();
        int[] input = {5, 1, 10, 2, 4};
        int value = 2;
        int start = -3;
        int finish = 3;
        int result = findValue.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFinishtOutOfBoundThenNoIndex() {
        FindLoop findValue = new FindLoop();
        int[] input = {5, 1, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 5;
        int result = findValue.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}