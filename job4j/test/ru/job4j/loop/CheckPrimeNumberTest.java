package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckPrimeNumberTest {

    @Test
    public void whenCheck5ThenTrue() {
        CheckPrimeNumber checkPrime = new CheckPrimeNumber();
        boolean result = checkPrime.check(5);
        assertThat(result, is(true));
    }

    @Test
    public void whenCheck4ThenFalse() {
        CheckPrimeNumber checkPrime = new CheckPrimeNumber();
        boolean result = checkPrime.check(4);
        assertThat(result, is(false));
    }

    @Test
    public void whenCheck1ThenTrue() {
        CheckPrimeNumber checkPrime = new CheckPrimeNumber();
        boolean result = checkPrime.check(1);
        assertThat(result, is(true));
    }
}