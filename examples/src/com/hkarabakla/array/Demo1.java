package com.hkarabakla.array;

public class Demo1 {

    public static void main(String[] args) {

        int[] numbers = {10, 23, -98, 76, 9, -123, -28, 0, 35};
        sort(numbers);
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) System.out.print(" , ");
        }
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
