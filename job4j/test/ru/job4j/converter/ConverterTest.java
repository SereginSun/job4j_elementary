package ru.job4j.converter;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert210RubThen3Euro() {
        Converter conv = new Converter();
        int value = 210;
        int expected = 3;
        int out = conv.rubleToEuro(value);
        assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        Converter conv = new Converter();
        int value = 240;
        int expected = 4;
        int out = conv.rubleToDollar(value);
        assertEquals(expected, out);
    }
}