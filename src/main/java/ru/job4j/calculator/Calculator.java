package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
    }

    private static void plus(int first, int second) {
        System.out.println(first + second);
    }
}
