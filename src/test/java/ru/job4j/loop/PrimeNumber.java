package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        if (finish < 2) {
            return 0;
        }
        if (finish == 2) {
            return 1;
        }
        int result = 1;
        for (int i = 3; i <= finish; i += 2) {
            if (CheckPrimeNumber.check(i)) {
                result++;
            }
        }
        return result;
    }
}
