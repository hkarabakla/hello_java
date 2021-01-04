package com.hkarabakla.lambda;

public class Main {
    public static void main(String[] args) {

        int value = 10;

        NumericFunc func = (a) -> {
            //value = 20;
            return value * a;
        };

        //value = 20;
    }
}
