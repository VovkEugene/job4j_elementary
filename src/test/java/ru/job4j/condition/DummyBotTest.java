package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyBotTest {
    @Test
    void whenGreetBot() {
        String input = "Hi, Bot.";
        String expected = "Hi, SmartAss.";
        String actual = DummyBot.answer(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenByeBot() {
        String input = "Bye.";
        String expected = "See you later.";
        String actual = DummyBot.answer(input);
        assertEquals(expected, actual);
    }

    @Test
    void whenUnknownBot() {
        String input = "Can you add two plus two?";
        String expected = "I don't know. Please, ask another question.";
        String actual = DummyBot.answer(input);
        assertEquals(expected, actual);
    }

}