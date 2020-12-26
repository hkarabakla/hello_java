package com.hkarabakla.generics.demo2;

public class Main {
    public static void main(String[] args) {

        KeyValuePair<String, String> strKeyValuePair = new KeyValuePair<>("name", "Java");
        strKeyValuePair.displayInfo();

        KeyValuePair<String, Integer> mixKeyValuePair = new KeyValuePair<>("age", 25);
        mixKeyValuePair.displayInfo();
    }
}
