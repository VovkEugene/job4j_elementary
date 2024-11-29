package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String separate = " ";
        String idea = "I like java!" + separate;
        System.out.println(idea);
        idea += "But I'm a newbie." + separate;
        System.out.println(idea);
        int year = 2024;
        idea += year + separate;
        System.out.println(idea);
    }
}
