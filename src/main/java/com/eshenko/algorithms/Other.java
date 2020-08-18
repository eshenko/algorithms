package com.eshenko.algorithms;

public class Other {

    //поиск факториала через рекурсию
    public static long fact(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * fact(num-1);
        }
    }

    //поиск факториала через цикл
    public static long factLoop(int num) {
        long result = num;
        for (int i = 1; i < num; i++) {
            result *= i;
        }
        return result;
    }

}
