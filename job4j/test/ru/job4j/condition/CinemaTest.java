package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CinemaTest {

    @Test
    public void whenAge21ThenGreeting() {
        Cinema cinema = new Cinema();
        int age = 21;
        String excepted = "Welcome to the cinema.";
        String result = cinema.access(age);
        assertThat(excepted, is(result));
    }

    @Test
    public void whenAge18ThenGreeting() {
        Cinema cinema = new Cinema();
        int age = 18;
        String excepted = "Welcome to the cinema.";
        String result = cinema.access(age);
        assertThat(excepted, is(result));
    }

    @Test
    public void whenAge16ThenFailure() {
        Cinema cinema = new Cinema();
        int age = 16;
        String excepted = "It is not for you.";
        String result = cinema.access(age);
        assertThat(excepted, is(result));
    }

    @Test
    public void whenTrueTrueThenTrue() {
        Cinema cinema = new Cinema();
        boolean allowByParent = true;
        boolean hasMoney = true;
        String excepted = "I can go to the cinema.";
        String result = cinema.permission(allowByParent, hasMoney);
        assertThat(excepted, is(result));
    }

    @Test
    public void whenTrueFalseThenFalse() {
        Cinema cinema = new Cinema();
        boolean allowByParent = true;
        boolean hasMoney = false;
        String excepted = "I can't.";
        String result = cinema.permission(allowByParent, hasMoney);
        assertThat(excepted, is(result));
    }

    @Test
    public void whenFalseTrueThenFalse() {
        Cinema cinema = new Cinema();
        boolean allowByParent = false;
        boolean hasMoney = true;
        String excepted = "I can't.";
        String result = cinema.permission(allowByParent, hasMoney);
        assertThat(excepted, is(result));
    }

    @Test
    public void whenFalseFalseThenFalse() {
        Cinema cinema = new Cinema();
        boolean allowByParent = false;
        boolean hasMoney = false;
        String excepted = "I can't.";
        String result = cinema.permission(allowByParent, hasMoney);
        assertThat(excepted, is(result));
    }
}