package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        EndsWith checker = new EndsWith();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = checker.check(word, post);
        assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        EndsWith checker = new EndsWith();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'l', 'a'};
        boolean result = checker.check(word, post);
        assertFalse(result);
    }
}