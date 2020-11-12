package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void whenNumIsEvenThenTrue() {
        LogicNot logic = new LogicNot();
        int num = 8;
        boolean excepted = true;
        boolean result = logic.isEven(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsEvenThenFalse() {
        LogicNot logic = new LogicNot();
        int num = 3;
        boolean excepted = false;
        boolean result = logic.isEven(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsPositiveThenTrue() {
        LogicNot logic = new LogicNot();
        int num = 3;
        boolean excepted = true;
        boolean result = logic.isPositive(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsPositiveThenFalse() {
        LogicNot logic = new LogicNot();
        int num = -3;
        boolean excepted = false;
        boolean result = logic.isPositive(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsNotEvenThenTrue() {
        LogicNot logic = new LogicNot();
        int num = 3;
        boolean excepted = true;
        boolean result = logic.notEven(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsNotEvenThenFalse() {
        LogicNot logic = new LogicNot();
        int num = 6;
        boolean excepted = false;
        boolean result = logic.notEven(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsNotPositiveThenTrue() {
        LogicNot logic = new LogicNot();
        int num = -6;
        boolean excepted = true;
        boolean result = logic.notPositive(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsNotPositiveThenFalse() {
        LogicNot logic = new LogicNot();
        int num = 6;
        boolean excepted = false;
        boolean result = logic.notPositive(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsNotEvenAndPositiveThenTrue() {
        LogicNot logic = new LogicNot();
        int num = 7;
        boolean excepted = true;
        boolean result = logic.notEvenAndPositive(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsNotEvenAndPositiveThenFalse() {
        LogicNot logic = new LogicNot();
        int num = -7;
        boolean excepted = false;
        boolean result = logic.notEvenAndPositive(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsEvenOrNotPositiveThenTrue() {
        LogicNot logic = new LogicNot();
        int num = -6;
        boolean excepted = true;
        boolean result = logic.evenOrNotPositive(num);
        assertEquals(excepted, result);
    }

    @Test
    public void whenNumIsEvenOrNotPositiveThenFalse() {
        LogicNot logic = new LogicNot();
        int num = 5;
        boolean excepted = false;
        boolean result = logic.evenOrNotPositive(num);
        assertEquals(excepted, result);
    }
}