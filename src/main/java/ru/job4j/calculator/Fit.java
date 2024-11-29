package ru.job4j.calculator;

public class Fit {
    private static final double COEFFICIENT = 1.15;
    private static final int MAN_HEIGHT_OFFSET = 100;
    private static final int WOMAN_HEIGHT_OFFSET = 110;

    public static double manWeight(short height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Рост должен быть положительным числом");
        }
        return (height - MAN_HEIGHT_OFFSET) * COEFFICIENT;
    }

    public static double womanWeight(short height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Рост должен быть положительным числом");
        }
        return (height - WOMAN_HEIGHT_OFFSET) * COEFFICIENT;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        double woman = womanWeight(height);
        System.out.printf("Идеальный вес для мужчин ростом %d см  - %.2f кг\n", height, man);
        System.out.printf("Идеальный вес для женщин ростом %d см - %.2f кг\n", height, woman);
    }
}
