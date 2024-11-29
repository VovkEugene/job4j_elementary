package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        double woman = womanWeight(height);
        System.out.printf("Идеальный вес для мужчин ростом 187 - %.2f кг\n", man);
        System.out.printf("Идеальный вес для женщин ростом 187 - %.2f кг\n", woman);
    }
}
