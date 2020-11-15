package ru.job4j.loop;

public class CheckPrimeNumber {

    public boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
