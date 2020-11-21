package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar arrayChar = new ArrayChar();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = arrayChar.startWith(word, pref);
        assertTrue(result);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar arrayChar = new ArrayChar();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = arrayChar.startWith(word, pref);
        assertFalse(result);
    }
}