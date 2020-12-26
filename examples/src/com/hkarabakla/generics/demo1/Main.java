package com.hkarabakla.generics.demo1;

public class Main {
    public static void main(String[] args) {

        GenericType<Integer> integerGenericType = new GenericType<>(7);
        integerGenericType.showType();
        Integer value1 = integerGenericType.getObj();
        System.out.println("Value of generic obj " + value1);

        GenericType<String> stringGenericType = new GenericType<>("--Generics--");
        stringGenericType.showType();
        String value2 = stringGenericType.getObj();
        System.out.println("Value of generic type " + value2);
    }
}
