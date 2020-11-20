package ru.job4j.array;

import java.util.Arrays;

public class SwitchArray {

    public int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public int[] swapBorder(int[] array) {
        swap(array, 0, array.length - 1);
        return array;
    }
}
