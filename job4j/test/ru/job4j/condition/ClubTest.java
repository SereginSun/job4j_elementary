package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ClubTest {

    @Test
    public void whenTrueTrueThenTrue() {
        Club club = new Club();
        boolean hasMoney = true;
        boolean beFriend = true;
        String excepted = "I can go to the club.";
        String result = club.permission(hasMoney, beFriend);
        assertThat(excepted, is(result));
    }

    @Test
    public void whenTrueFalseThenTrue() {
        Club club = new Club();
        boolean hasMoney = true;
        boolean beFriend = false;
        String excepted = "I can go to the club.";
        String result = club.permission(hasMoney, beFriend);
        assertThat(excepted, is(result));
    }

    @Test
    public void whenFalseTrueThenTrue() {
        Club club = new Club();
        boolean hasMoney = false;
        boolean beFriend = true;
        String excepted = "I can go to the club.";
        String result = club.permission(hasMoney, beFriend);
        assertThat(excepted, is(result));
    }

    @Test
    public void whenFalseFalseThenFalse() {
        Club club = new Club();
        boolean hasMoney = false;
        boolean beFriend = false;
        String excepted = "I can't.";
        String result = club.permission(hasMoney, beFriend);
        assertThat(excepted, is(result));
    }
}