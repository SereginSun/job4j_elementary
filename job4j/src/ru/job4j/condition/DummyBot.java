package ru.job4j.condition;

public class DummyBot {

    public String answer(String question) {
        String result = "It puzzles me. Ask another question.";
        if ("Hello, bot".equals(question)) {
            result = "Hello smart guy.";
        } else if ("Bye".equals(question)) {
            result = "See you soon.";
        }
        return result;
    }
}
