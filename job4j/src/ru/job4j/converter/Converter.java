package ru.job4j.converter;

public class Converter {

    private int rubleToEuro(int value) {
        int euro = 70;
        return value / euro;
    }

    private int rubleToDollar(int value) {
        int dollar = 60;
        return value / dollar;
    }

    public static void main(String[] args) {
        Converter conv1 = new Converter();
        int value1 = 210;
        int expected1 = 3;
        int out1 = conv1.rubleToEuro(value1);
        boolean passed1 = expected1 == out1;
        System.out.printf("%s rubles are %s euro. Test result: %s%n", value1, conv1.rubleToEuro(value1), passed1);
        Converter conv2 = new Converter();
        int value2 = 240;
        int expected2 = 4;
        int out2 = conv2.rubleToDollar(value2);
        boolean passed2 = expected2 == out2;
        System.out.printf("%s rubles are %s dollars. Test result: %s.", value2, conv2.rubleToDollar(value2), passed2);
    }
}
