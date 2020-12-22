package com.hkarabakla.fundamentals;

import java.util.Scanner;

public class FundamentalsDemo5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature today : ");

        int temperature = scanner.nextInt();
        String day = scanner.next();

        if (temperature < 20) {
            System.out.println("A little bit cold.");
        } else if (temperature < 25 && day.equals("Sunday")) {
            System.out.println("It's cool.");
        } else {
            System.out.println("It's warm, drink water.");
        }

        ///
    }
}
