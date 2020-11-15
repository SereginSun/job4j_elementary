package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish, CheckPrimeNumber checkPrime) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (checkPrime.check(number)) {
                count++;
            }
        }
        return count;
    }
}
