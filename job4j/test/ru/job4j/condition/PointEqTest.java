package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointEqTest {

    @Test
    public void whenPointsDontMatchThenFalse() {
        PointEq pointComp = new PointEq();
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 2);
        boolean expected = false;
        boolean result = pointComp.eq(firstPoint, secondPoint);
        assertEquals(expected, result);
    }

    @Test
    public void whenPointsAreTheSameThenTrue() {
        PointEq pointComp = new PointEq();
        Point firstPoint = new Point(1, 0);
        Point secondPoint = new Point(1, 0);
        boolean expected = true;
        boolean result = pointComp.eq(firstPoint, secondPoint);
        assertEquals(expected, result);
    }
}