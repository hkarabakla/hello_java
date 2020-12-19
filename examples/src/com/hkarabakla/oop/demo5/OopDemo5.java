package com.hkarabakla.oop.demo5;

public class OopDemo5 {
    public static void main(String[] args) {

        int value = 5;
        Vehicle vehicle = new Vehicle(4, 60, 6, false, "BMW");

        System.out.println("Value : " + value);
        System.out.println("Brand of vehicle : " + vehicle.brand);

        doSomeOperation(value, vehicle);
        System.out.println("After the operation -------");
        System.out.println("Value : " + value);
        System.out.println("Brand of vehicle : " + vehicle.brand);
    }

    public static void doSomeOperation(int value, Vehicle vehicle) {
        value = 10;
        vehicle.brand = "Mercedes";
    }
}
