package com.hkarabakla.oop.demo4;

public class SimpleMath {
    int add (int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    boolean isOddNumber(int a) {
        if (a % 2 == 0) {
            return false;
        }
        return true;
    }

    boolean isFactor(int a, int b) {
        return a % b == 0;
    }

    public int addAll(int[] args) {
        int sum = 0;
        for (int value : args) {
            sum += value;
        }
        return sum;
    }
}
