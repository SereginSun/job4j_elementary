package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.printf("Array size of ages[]: %s%n", ages.length);
        System.out.printf("Array size of surnames[]: %s%n", surnames.length);
        System.out.printf("Array size of prices[]: %s%n", prices.length);

        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Vladimir";
        names[2] = "Oleg";
        names[3] = "Svetlana";

        for (var name: names) {
            System.out.printf("%s%n", name);
        }
    }
}