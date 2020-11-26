package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DefragmentTest {

    @Test
    public void whenFirstNullThenCompressed() {
        Defragment aDefragment = new Defragment();
        String[] input = {null, "I"};
        String[] compressed = aDefragment.compress(input);
        String[] expected = {"I", null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void whenNotFirstNullThenCompressed() {
        Defragment aDefragment = new Defragment();
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = aDefragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void whenAllNullAtFirstThenCompressed() {
        Defragment aDefragment = new Defragment();
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = aDefragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }
}