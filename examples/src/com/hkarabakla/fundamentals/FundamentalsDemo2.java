package com.hkarabakla.fundamentals;

import java.util.Scanner;

public class FundamentalsDemo2 {

    public static void main(String[] args) {

        System.out.println("Welcome " + getUserDeatils());
    }

    private static String getUserDeatils() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        return name + " " + age;
    }
}
