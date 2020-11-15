package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeNumberTest {

    @Test
    public void whenNumbers5ThenCount3() {
        PrimeNumber numb = new PrimeNumber();
        CheckPrimeNumber checkPrime = new CheckPrimeNumber();
        int result = numb.calc(5, checkPrime);
        assertThat(result, is(3));
    }

    @Test
    public void whenNumbers11ThenCount5() {
        PrimeNumber numb = new PrimeNumber();
        CheckPrimeNumber checkPrime = new CheckPrimeNumber();
        int result = numb.calc(11, checkPrime);
        assertThat(result, is(5));
    }

    @Test
    public void whenNumbers2ThenCount1() {
        PrimeNumber numb = new PrimeNumber();
        CheckPrimeNumber checkPrime = new CheckPrimeNumber();
        int result = numb.calc(2, checkPrime);
        assertThat(result, is(1));
    }
}