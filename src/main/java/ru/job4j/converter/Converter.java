package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 115.00F;
    }

    public static float rubleToDollar(float value) {
        return value / 110.00F;
    }

    public static void main(String[] args) {
        float input = 230.0F;
        float expected = 2.0F;
        float actual = rubleToEuro(input);
        boolean passed = (expected == actual);
        System.out.printf("%.2f рублей равно 2 евро. Результат теста: %b.\n", input, passed);
        input = 220F;
        actual = rubleToDollar(input);
        passed = (expected == actual);
        System.out.printf("%.2f рублей равно 2 доллара. Результат теста: %b.\n", input, passed);
    }
}
