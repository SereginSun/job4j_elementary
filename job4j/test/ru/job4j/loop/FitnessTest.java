package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        Fitness fit = new Fitness();
        int month = fit.calc(95, 90);
        assertThat(month, is(0));
    }

    @Test
    public void whenIvanIsLessThanNickThenIvanWillNeed1Month() {
        Fitness fit = new Fitness();
        int month = fit.calc(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanIsLessThanNickThenIvanWillNeed3Month() {
        Fitness fit = new Fitness();
        int month = fit.calc(30, 90);
        assertThat(month, is(3));
    }

}