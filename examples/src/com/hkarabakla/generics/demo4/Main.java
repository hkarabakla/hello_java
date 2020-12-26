package com.hkarabakla.generics.demo4;

public class Main {
    public static void main(String[] args) {

        NumericOperation<Double> doubleNumeric = new NumericOperation<>(2.5);
        NumericOperation<Float> floatNumeric = new NumericOperation<>(-2.5f);

        System.out.println(doubleNumeric.absEqual(floatNumeric));
    }
}
