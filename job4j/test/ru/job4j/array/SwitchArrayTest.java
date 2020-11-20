package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        SwitchArray switcher = new SwitchArray();
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] result = switcher.swap(input, 0, input.length - 1);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSwap1To2() {
        SwitchArray switcher = new SwitchArray();
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 3, 2, 4};
        int[] result = switcher.swap(input, 1, 2);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSwap0To2() {
        SwitchArray switcher = new SwitchArray();
        int[] input = {1, 2, 3, 4};
        int[] expect = {3, 2, 1, 4};
        int[] result = switcher.swap(input, 0, input.length - 2);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSwapBorder() {
        SwitchArray switcher = new SwitchArray();
        int[] input = {1, 2, 3, 4, 5};
        int[] expect = {5, 2, 3, 4, 1};
        int[] result = switcher.swapBorder(input);
        assertThat(result, is(expect));
    }
}