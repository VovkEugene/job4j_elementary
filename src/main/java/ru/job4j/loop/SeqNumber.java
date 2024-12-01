package ru.job4j.loop;

public class SeqNumber {
    public static void calc(int n) {
        int hold = 0;
        for (int i = 1; i <= n; i++) {
            hold += i;
            System.out.println(hold);
            if (hold == n) {
                System.out.println("N = " + n + ". Success");
                break;
            } else if (hold > n) {
                System.out.println("N = " + n + ". Not possible");
                break;
            }
        }
    }

    public static void main(String[] args) {
        calc(6);
        calc(5);
        calc(3);
    }
}
