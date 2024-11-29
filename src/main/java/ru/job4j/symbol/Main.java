package ru.job4j.symbol;

public class Main {
    public static void main(String[] args) {
        char c1 = '\u0035';
        char c2 = '\u004D';
        char c3 = '\u006E';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("\u0031\u0032\u0033");
        int a = 'A';
        int b = 'B';
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("A + B: " + (a + b));
        System.out.println(++a);
        char d = 'D';
        System.out.println(--d);
    }
}
