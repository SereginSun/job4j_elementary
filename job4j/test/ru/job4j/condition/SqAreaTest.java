package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenPIs6KIs2ThenSqareaIs2() {
        int p = 6;
        int k = 2;
        int expected = 2;
        double result = SqArea.sqarea(p, k);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenPIs8KIs3ThenSqareaIs3() {
        int p = 8;
        int k = 3;
        int expected = 3;
        double result = SqArea.sqarea(p, k);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenPIs32KIs7ThenSqareaIs28() {
        int p = 32;
        int k = 7;
        int expected = 28;
        double result = SqArea.sqarea(p, k);
        assertEquals(expected, result, 0.01);
    }
}