package com.hkarabakla.generics.demo6;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 6, 7, 9, 10};
        GenericInterfaceDemo<Integer> interfaceDemo = new GenericInterfaceDemo<>(integers);
        System.out.println("Contains 5 : " + interfaceDemo.contains(5));
        System.out.println("Contains 7 : " + interfaceDemo.contains(7));
    }
}
