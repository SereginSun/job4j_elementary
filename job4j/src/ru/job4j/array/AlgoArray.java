package ru.job4j.array;

import java.util.Arrays;

public class AlgoArray {

    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        System.out.println(Arrays.toString(array));

        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
