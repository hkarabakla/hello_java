package com.hkarabakla;

public class Main {

    public static void main(String[] args) {

        String first = "First sentence";
        String second = "Second sentence";
        String third = "Third sentence";
        String fourth = "Fourth sentence";
        String fifth = "Fifth sentence";
        StringBuilder sb = new StringBuilder();
        sb.append(first)
                .append(second)
                .append(third)
                .append(fourth)
                .append(fifth);

        System.out.println(sb.toString());
    }
}
