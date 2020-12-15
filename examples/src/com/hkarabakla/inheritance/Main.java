package com.hkarabakla.inheritance;

public class Main {

    public static void main(String[] args) {

        ArrayOperations operations = new ArrayOperations();
        int[] numbers = new int[7];
        try {
            System.out.println("try block is started");
            throw new RuntimeException();
        } finally {
            System.out.println("try block is started");
        }

    }
}
