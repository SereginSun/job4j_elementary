package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenCheckArraysThenEquals() {
        EqLast checker = new EqLast();
        int[] left = {1, 3};
        int[] right = {4, 5, 3};
        assertTrue(checker.check(left, right));
    }

    @Test
    public void whenCheckArraysThenNotEquals() {
        EqLast checker = new EqLast();
        int[] left = {1, 2, 3};
        int[] right = {4, 5};
        assertFalse(checker.check(left, right));
    }
}