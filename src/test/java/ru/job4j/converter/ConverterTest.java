package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {
    private static final float DELTA = 0.0001F;

    @Test
    void whenConvert230RblThen2Euro() {
        float input = 230F;
        float expected = 2F;
        float actual = Converter.rubleToEuro(input);
        assertEquals(expected, actual, DELTA, "Conversion from rubles to euros is incorrect");
    }

    @Test
    void whenConvert220RblThen2Dollar() {
        float input = 220F;
        float expected = 2F;
        float actual = Converter.rubleToDollar(input);
        assertEquals(expected, actual, DELTA, "Conversion from rubles to dollars is incorrect");
    }

    @Test
    void whenConvert0RblThen0Euro() {
        float input = 0F;
        float expected = 0F;
        float actual = Converter.rubleToEuro(input);
        assertEquals(expected, actual, DELTA, "Conversion from rubles to euros is incorrect");
    }

    @Test
    void whenConvert0RblThen0Dollar() {
        float input = 0F;
        float expected = 0F;
        float actual = Converter.rubleToDollar(input);
        assertEquals(expected, actual, DELTA, "Conversion from rubles to dollars is incorrect");
    }
}