package ru.job4j.array;

import java.util.stream.IntStream;

public class Square {
    public static int[] calculate(int bound) {
       return IntStream.range(0, bound)
                .map(i -> i * i)
                .toArray();
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int item : array) {
            System.out.println(item);
        }
    }
}
