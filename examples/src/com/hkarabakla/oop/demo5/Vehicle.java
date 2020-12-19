package com.hkarabakla.oop.demo5;

public class Vehicle {
    int passengers;
    double fuelCapacity;
    int fuelConsumptionPerKm;
    boolean isSport;
    String brand;

    public Vehicle(int passengers, double fuelCapacity, int fuelConsumptionPerKm, boolean isSport, String brand) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        this.isSport = isSport;
        this.brand = brand;
    }

    double range () {
        return fuelCapacity / fuelConsumptionPerKm;
    }
}
