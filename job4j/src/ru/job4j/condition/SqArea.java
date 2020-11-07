package ru.job4j.condition;

/**
 * If the perimeter of the rectangle is 6,
 * and the coefficient (how many times the length is greater than the height) is 2,
 * then the area of this rectangle will be 2.
 */
public class SqArea {

    private static double sqarea(int p, int k) {
        return Math.pow(p / (2 * (k + 1)), 2) * k;
    }

    public static void main(String[] args) {
        System.out.printf("p = 6, k = 2, s = 2, actual = %s", sqarea(6, 2));
    }
}
