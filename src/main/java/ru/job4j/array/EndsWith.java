package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] postfix) {
        int start = word.length - postfix.length;
        int end = postfix.length;
        for (int i = 0; i < end; i++) {
            if (word[start + i] != postfix[i]) {
                return false;
            }
        }
        return true;
    }
}
