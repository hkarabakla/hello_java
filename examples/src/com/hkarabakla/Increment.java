package com.hkarabakla;

public class Increment {

    public static void main(String[] args) {
        String userEmail = "usercom@email.com";
        int positionOfChar = userEmail.indexOf('@');

        System.out.println("Position of @ : " + userEmail.indexOf('@'));
        System.out.println("Position of 'email' : " + userEmail.indexOf("email"));
        System.out.println("Position of 'com' : " + userEmail.indexOf("com", userEmail.indexOf('@')));
    }
}
