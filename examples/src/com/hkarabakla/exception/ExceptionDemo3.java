package com.hkarabakla.exception;

public class ExceptionDemo3 {

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 34, 56, 23, 78};
        int[] dividers = new int[] {5, 0, 12, 0, 34};

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + "/" + dividers[i] + "=" + numbers[i]/dividers[i]);
            } catch (ArithmeticException ex) {
                System.out.println("Division by 0, " + numbers[i] + "/" + dividers[i]);
            }
        }

        System.out.println("Program ended successfully");
    }
}
