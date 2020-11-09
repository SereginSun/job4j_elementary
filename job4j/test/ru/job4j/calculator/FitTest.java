package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMansHeightIs174Then85() {
        Fit fit = new Fit();
        short in = 174;
        double excepted = 85.1;
        double out = fit.manWeight(in);
        assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenMansHeightIs180Then92() {
        Fit fit = new Fit();
        short in = 180;
        double excepted = 92;
        double out = fit.manWeight(in);
        assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenWomansHeightIs170Then69() {
        Fit fit = new Fit();
        short in = 170;
        double excepted = 69;
        double out = fit.womanWeight(in);
        assertEquals(excepted, out, 0.01);
    }

    @Test
    public void whenWomansHeightIs163Then61() {
        Fit fit = new Fit();
        short in = 150;
        double excepted = 46;
        double out = fit.womanWeight(in);
        assertEquals(excepted, out, 0.01);
    }
}