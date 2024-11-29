package ru.job4j.condition;

public class OperatorsRunner {
    public static void main(String[] args) {
        int first = 2;
        int second = 10;
        int result = first + second;
        System.out.println("Result sum: " + result);
        result = second - first;
        System.out.println("Result subtract: " + result);
        result = first * second;
        System.out.println("Result multiply: " + result);
        result = second / first;
        System.out.println("Result divide: " + result);
        System.out.println("Remainder after division: " + second % first);
        second = 7;
        System.out.println("Remainder after division: " + second % first);
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
        i = 100;
        System.out.println("Use increment: " + i++);
        System.out.println("After increment: " + i);
        System.out.println("Use decrement: " + i--);
        System.out.println("After decrement: " + i);
        System.out.println("Before increment: " + i);
        System.out.println("Use increment: " + ++i);
        System.out.println("Before decrement: " + i);
        System.out.println("Use decrement: " + --i);
        first = 2;
        second = 10;
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
