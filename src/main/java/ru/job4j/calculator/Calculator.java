package ru.job4j.calculator;

public class Calculator {

    private static void plus(int first, int second) {
        System.out.println(first + second);
    }

    private static void minus(int first, int second) {
        System.out.println(first - second);
    }

    public static void main(String[] args) {
        plus(1, 2);
        plus(10, 11);
        minus(7, 3);
        minus(2, 6);
    }
}
