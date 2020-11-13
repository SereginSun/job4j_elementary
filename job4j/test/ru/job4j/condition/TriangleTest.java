package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {

    @Test
    public void whenExist() {
        Triangle triangle = new Triangle();
        boolean result = triangle.exist(2.0, 3.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenDoesNotExist() {
        Triangle triangle = new Triangle();
        boolean result = triangle.exist(6.0, 3.0, 2.0);
        assertThat(result, is(false));
    }
}