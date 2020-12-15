package com.hkarabakla.exception;

public class ExceptionDemo5 {

    public static void main(String[] args) {
        try {
            multipleDivision();
        } catch (RuntimeException ex) {
            System.out.println("Fatal error, program terminated");
        }
    }

    private static void multipleDivision() {
        int[] numbers = new int[] {1, 34, 56, 23, 78, 123, 49};
        int[] dividers = new int[] {5, 0, 12, 0, 34};

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + "/" + dividers[i] + "=" + numbers[i]/dividers[i]);
            } catch (ArithmeticException ex) {
                System.out.println("Division by 0, " + numbers[i] + "/" + dividers[i]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Array sizes are not equal");
                throw new ArrayIndexOutOfBoundsException("Array sizes must be equal");
            }
        }

        System.out.println("Program ended successfully");
    }
}
