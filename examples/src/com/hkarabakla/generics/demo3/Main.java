package com.hkarabakla.generics.demo3;

public class Main {
    public static void main(String[] args) {

        NumericOperation<Integer> intValue = new NumericOperation<>(23);
        System.out.println("Is " + intValue.getObj() + " dividable by ten : " + intValue.isDividableByTen());

        NumericOperation<Double> doubleValue = new NumericOperation<>(23.12);
        System.out.println("Is " + doubleValue.getObj() + " dividable by ten : " + doubleValue.isDividableByTen());

        NumericOperation<Double> doubleValue2 = new NumericOperation<>(30.0);
        System.out.println("Is " + doubleValue2.getObj() + " dividable by ten : " + doubleValue2.isDividableByTen());

        //NumericOperation<String> stringNumericOperation = new NumericOperation<String>("invalid parameter type"); // HATA
    }
}
