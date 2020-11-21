package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check checker = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = checker.mono(input);
        assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenTrue() {
        Check checker = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = checker.mono(input);
        assertFalse(result);
    }
}