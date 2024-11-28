package ru.job4j;

/**
 * вывод всей таблицы умножения на один
 */
public class Multiple {
    public static void main(String[] args) {
        System.out.println(timesOne());
    }

    private static String timesOne() {
        int one = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            sb.append(String.format("%d * %d = %d\n", one, i, (one * i)));
        }
        return sb.toString();
    }
}
