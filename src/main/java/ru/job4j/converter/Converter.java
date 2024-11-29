package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 116.14F;
    }

    public static float rubleToDollar(float value) {
        return value / 109.57F;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println("140 рублей это " + decimal.format(euro) + " евро.");
        System.out.printf("140 рублей это %.2f долларов.", dollar);
    }
}
