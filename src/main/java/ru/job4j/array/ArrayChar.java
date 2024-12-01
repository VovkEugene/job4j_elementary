package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] prefix) {
        int length = prefix.length;
        for (int i = 0; i < length; i++) {
            if (word[i] != prefix[i]) {
                return false;
            }
        }
        return true;
    }
}
