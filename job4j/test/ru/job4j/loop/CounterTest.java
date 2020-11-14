package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenFrom0To10ThenSum55() {
        Counter count = new Counter();
        int result = count.sum(0, 10);
        assertEquals(55, result);
    }

    @Test
    public void whenFrom3To8ThenSum55() {
        Counter count = new Counter();
        int result = count.sum(3, 8);
        assertEquals(33, result);
    }

    @Test
    public void whenFrom1To1ThenSum1() {
        Counter count = new Counter();
        int result = count.sum(1, 1);
        assertEquals(1, result);
    }

    @Test
    public void whenFrom1To2ThenSum3() {
        Counter count = new Counter();
        int result = count.sum(1, 2);
        assertEquals(3, result);
    }
}