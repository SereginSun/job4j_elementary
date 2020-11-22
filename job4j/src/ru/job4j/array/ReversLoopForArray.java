package ru.job4j.array;

public class ReversLoopForArray {

    public static void main(String[] args) {
        int[] numb = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numb.length; i++) {
            if (numb[numb.length - 1 - i] % 2 == 0) {
                System.out.printf("The current even element of the array, starting with the last one: %s.%n",
                        numb[numb.length - 1 - i]);
            }
        }
    }
}
