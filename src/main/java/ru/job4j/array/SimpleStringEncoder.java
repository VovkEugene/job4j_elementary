package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        StringBuilder sb = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else if (symbol != input.charAt(i) && counter > 1) {
                sb.append(symbol).append(counter);
                symbol = input.charAt(i);
                counter = 1;
            } else {
                sb.append(symbol);
                symbol = input.charAt(i);
            }
        }
        sb.append(symbol);
        if (counter > 1) {
            sb.append(counter);
        }
        return sb.toString();
    }
}
