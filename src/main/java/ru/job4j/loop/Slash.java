package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        char symbol = '0';
        char empty = ' ';
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || j == size - 1 - i) {
                    System.out.print(symbol);
                } else {
                    System.out.print(empty);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
