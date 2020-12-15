package com.hkarabakla.inheritance;

public class Main {

    public static void main(String[] args) {

        ArrayOperations operations = new ArrayOperations();
        int[] numbers = new int[7];
        try {
            System.out.println("try block is started");
            operations.putValue(numbers, 10, 27);
            System.out.println("try block is ended");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException catched " + ex.toString());
        }

        System.out.println("Program ends gracefully");
    }
}
