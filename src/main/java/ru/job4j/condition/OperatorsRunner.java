package ru.job4j.condition;

public class OperatorsRunner {
    public static void main(String[] args) {
        int i = 1234;
        int thousands = i / 1000;
        int hundreds = i % 1000 / 100;
        int tens = i % 100 / 10;
        int ones = i % 10;
        System.out.println(
                "Thousands: " + thousands
                        + ", Hundreds: " + hundreds
                        + ", Tens: " + tens
                        + ", Ones: " + ones
        );
        int first = 2;
        int second = 10;
        first += second;
        System.out.println("Result sum: " + first);
        first = 2;
        second -= first;
        System.out.println("Result subtract: " + second);
        second = 10;
        first *= second;
        System.out.println("Result multiply: " + first);
        first = 2;
        second /= first;
        System.out.println("Result divide: " + second);
        int one = 10;
        double two = 100.0;
        System.out.println(one + two);
        one += two;
        System.out.println(one);
    }
}
