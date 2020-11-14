package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalcFactFor5Then120() {
        Factorial fact = new Factorial();
        int result = fact.calc(5);
        assertEquals(120, result);
    }

    @Test
    public void whenCalcFactFor0Then1() {
        Factorial fact = new Factorial();
        int result = fact.calc(0);
        assertEquals(1, result);
    }

    @Test
    public void whenCalcFactFor1Then1() {
        Factorial fact = new Factorial();
        int result = fact.calc(1);
        assertEquals(1, result);
    }

    @Test
    public void whenCalcFactFor10Then3628800() {
        Factorial fact = new Factorial();
        int result = fact.calc(10);
        assertEquals(3_628_800, result);
    }
}