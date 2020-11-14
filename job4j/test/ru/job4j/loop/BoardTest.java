package ru.job4j.loop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    private static final String LN = System.lineSeparator();

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream setOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(setOut);
    }

    @Test
    public void whenSize3ThenPaint3x3() {
        Board grid = new Board();
        String expected = String.join(LN,
                "X X",
                " X ",
                "X X",
                "");
        grid.paint(3);
        assertEquals(expected, output.toString());
    }

    @Test
    public void whenSize5ThenPaint5x5() {
        Board grid = new Board();
        String expected = String.join(LN,
                "X X X",
                " X X ",
                "X X X",
                " X X ",
                "X X X",
                "");
        grid.paint(5);
        assertEquals(expected, output.toString());
    }
}