package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20distanceThen2() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 0);
        double excepted = 2.0;
        double result = Point.distance(firstPoint, secondPoint);
        assertEquals(excepted, result, 0.01);
    }

    @Test
    public void when11to54distanceThen2() {
        Point firstPoint = new Point(1, 1);
        Point secondPoint = new Point(5, 4);
        double excepted = 5.0;
        double result = Point.distance(firstPoint, secondPoint);
        assertEquals(excepted, result, 0.01);
    }

    @Test
    public void when10to34distanceThen2() {
        Point firstPoint = new Point(1, 0);
        Point secondPoint = new Point(3, 4);
        double excepted = 4.47;
        double result = Point.distance(firstPoint, secondPoint);
        assertEquals(excepted, result, 0.01);
    }
}