package com.hkarabakla;

public class Main {

    public static void main(String[] args) {

        int value = 5;
        Vehicle vehicle = new Vehicle(4, 60, 6, false, "BMW");

        System.out.println("Value : " + value);
        System.out.println("Brand of vehicle : " + vehicle.brand);

        doSomeOperation(value, vehicle);
        System.out.println("After operation -------");
        System.out.println("Value : " + value);
        System.out.println("Brand of vehicle : " + vehicle.brand);
    }

    public static void doSomeOperation(int value, Vehicle vehicle) {
        value = 10;
        vehicle.brand = "Mercedes";
    }
}
