package ru.job4j.loop;

public class Board {

    public static void paint(int width, int height) {
        char black = 'x';
        char white = ' ';
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(black);
                } else {
                    System.out.print(white);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
