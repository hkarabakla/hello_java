package com.hkarabakla.inheritance;

import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        StringFunc strReader = () -> {
            String result = "";
            InputStreamReader reader = new InputStreamReader(System.in);
            result = String.valueOf(reader.read());

            return result;
        };


        NumericTest<Integer> isFactor = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Divider cannot be zero");
            }
            return a % b == 0;
        };

        isFactor.test(20, 5);

        isFactor.test(20, 0);

    }
}
