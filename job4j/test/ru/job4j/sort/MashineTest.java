package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MashineTest {

    @Test
    public void whenEquals() {
        Mashine cofeMashine = new Mashine();
        int[] expect = {};
        int[] result = cofeMashine.change(100, 100);
        assertThat(result, is(expect));
    }

    @Test
    public void when50By35() {
        Mashine cofeMashine = new Mashine();
        int[] expect = {10, 5};
        int[] result = cofeMashine.change(50, 35);
        assertThat(result, is(expect));
    }

    @Test
    public void when100By42() {
        Mashine cofeMashine = new Mashine();
        int[] expect = {10, 10, 10, 10, 10, 5, 2, 1};
        int[] result = cofeMashine.change(100, 42);
        assertThat(result, is(expect));
    }
}