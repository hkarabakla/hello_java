package com.hkarabakla.inheritance;

public class MyIntPredicates {

    boolean isPrime(int value) {

        if (value < 2) {
            return false;
        }

        for (int i = 2; i < value / i; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    boolean isEven(int value) {
        return value % 2 == 0;
    }

    boolean isNegative(int value) {
        return value < 0;
    }

    boolean isPositive(int value) {
        return value > 0;
    }
}
