package ru.job4j.sort;

import java.util.Arrays;

public class Mashine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] result = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; change > 0; i++) {
            while (change - coins[i] >= 0) {
                change -= coins[i];
                result[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
