package com.hkarabakla.fundamentals;

import java.util.Scanner;

public class FundamentalsDemo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Your availability for driving licence : " + isEligibleToHaveADrivingLicence(age));
    }

    public static boolean isEligibleToHaveADrivingLicence(int age) {

        if(age < 18 && age > 50) {
            System.out.println("It's too early to drive !!!");
            return false;
        }

        return true;
    }
}
