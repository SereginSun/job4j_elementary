package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort5numb() {
        SortSelected sorter = new SortSelected();
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = sorter.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3numb() {
        SortSelected sorter = new SortSelected();
        int[] input = new int[] {4, 1, 2};
        int[] result = sorter.sort(input);
        int[] expect = new int[] {1, 2, 4};
        assertThat(result, is(expect));
    }
}