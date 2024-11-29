package ru.job4j;

public class Types {
    public static void main(String[] args) {
        byte b = 100;
        short s = b;
        int i = s;
        long l = i;
        System.out.println("Вывод в консоль значения после расширения: " + l);
        i = 2_147_483_600;
        float f = i;
        System.out.println("Вывод в консоль значения после преобразования: " + f);
        i = 10000;
        b = (byte) i;
        s = (short) i;
        System.out.println("Вывод в консоль значения после преобразования: " + b);
        System.out.println("Вывод в консоль значения после преобразования: " + s);
        double d = 94.984751;
        i = (int) d;
        System.out.println("Вывод в консоль значения после преобразования: " + i);
        d = 94.984751;
        i = (int) Math.round(d);
        System.out.println("Вывод в консоль значения после преобразования: " + i);
        i = 100;
        char c = (char) i;
        System.out.println("Вывод в консоль значения после преобразования: " + c);
        i = 100;
        d = 85.6;
        double result = i + d;
        System.out.println("Результат вычисления: " + result);
        result = 100 + 's';
        System.out.println("Результат вычисления: " + result);
    }
}
