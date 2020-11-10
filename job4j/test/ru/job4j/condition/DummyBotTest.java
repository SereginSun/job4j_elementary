package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DummyBotTest {

    @Test
    public void whenQuestionIsHelloThenHello() {
        DummyBot bot = new DummyBot();
        String in = "Hello, bot";
        String expected = "Hello smart guy.";
        String result = bot.answer(in);
        assertThat(expected, is(result));
    }

    @Test
    public void whenQuestionIsByeThenBye() {
        DummyBot bot = new DummyBot();
        String in = "Bye";
        String expected = "See you soon.";
        String result = bot.answer(in);
        assertThat(expected, is(result));
    }

    @Test
    public void whenQuestionIsSomethingThenUnknown() {
        DummyBot bot = new DummyBot();
        String in = "What is 2 + 2?";
        String expected = "It puzzles me. Ask another question.";
        String result = bot.answer(in);
        assertThat(expected, is(result));
    }
}