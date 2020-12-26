package com.hkarabakla.generics.demo5;

public class Main {
    public static void main(String[] args) {

        GenericMethodDemo genericMethodDemo = new GenericMethodDemo();

        Integer[] integers1 = new Integer[]{1, 2, 3, 4, 5};
        Integer[] integers2 = new Integer[]{1, 2, 3, 4, 5};
        Integer[] integers3 = new Integer[]{1, 2, 3, 4, 5, 7};

        Double[] doubles = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0};

        System.out.println("integers1 is equal to integers1 : " + genericMethodDemo.arraysEqual(integers1, integers1));
        System.out.println("integers1 is equal to integers2 : " + genericMethodDemo.arraysEqual(integers1, integers2));
        System.out.println("integers1 is equal to integers3 : " + genericMethodDemo.arraysEqual(integers1, integers3));

        //System.out.println("integers1 is equal to doubles : " + genericMethodDemo.arraysEqual(integers1, doubles));
    }
}
