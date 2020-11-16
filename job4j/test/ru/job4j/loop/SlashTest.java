package ru.job4j.loop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SlashTest {
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
    public void whenSize3ThenDraw3x3() {
        Slash slash = new Slash();
        String expected = String.join(LN,
                "0 0",
                " 0 ",
                "0 0",
                "");
        slash.draw(3);
        assertEquals(expected, output.toString());
    }

    @Test
    public void whenSize5ThenDraw5x5() {
        Slash slash = new Slash();
        String expected = String.join(LN,
                "0   0",
                " 0 0 ",
                "  0  ",
                " 0 0 ",
                "0   0",
                "");
        slash.draw(5);
        assertEquals(expected, output.toString());
    }

}