package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwitchWeekTest {

    @Test
    public void when6nameOfDayIsSaturday() {
        SwitchWeek week = new SwitchWeek();
        String result = week.nameOfDay(6);
        assertEquals("Saturday", result);
    }

    @Test
    public void when3nameOfDayIsWednesday() {
        SwitchWeek week = new SwitchWeek();
        String result = week.nameOfDay(3);
        assertEquals("Wednesday", result);
    }

    @Test
    public void when1nameOfDayIsMonday() {
        SwitchWeek week = new SwitchWeek();
        String result = week.nameOfDay(1);
        assertEquals("Monday", result);
    }

    @Test
    public void when8nameOfDayIsMistake() {
        SwitchWeek week = new SwitchWeek();
        String result = week.nameOfDay(8);
        assertEquals("mistake", result);
    }
}