package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To2Then5() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To2To3Then3() {
        int result = Max.max(1, 3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax7To5To3Then7() {
        int result = Max.max(7, 5, 3);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax3To8To5To6Then8() {
        int result = Max.max(3, 8, 5, 6);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}