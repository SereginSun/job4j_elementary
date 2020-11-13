package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondIsMax() {
        MultiMax max = new MultiMax();
        int result = max.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstIsMax() {
        MultiMax max = new MultiMax();
        int result = max.max(5, 4, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdIsMax() {
        MultiMax max = new MultiMax();
        int result = max.max(5, 4, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenAllNumbsAreTheSame() {
        MultiMax max = new MultiMax();
        int result = max.max(5, 5, 5);
        assertThat(result, is(5));
    }
}