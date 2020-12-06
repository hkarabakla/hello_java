package com.hkarabakla.inheritance;

public class Main {


    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3 = new Vehicle();

        Vehicle[] myCars = new Vehicle[] {vehicle1, vehicle2, vehicle3};

        vehicle1.setBrand("Audi");
        vehicle1.setModel("A4");
        vehicle1.setYearOfConstruction(2019);

        vehicle2.setBrand("BMW");
        vehicle2.setModel("M4");
        vehicle2.setYearOfConstruction(2020);

        vehicle3.setBrand("Ford");
        vehicle3.setModel("Focus");
        vehicle3.setYearOfConstruction(2018);

        for (Vehicle v: myCars) {
            System.out.println(v.getBrand() + " " + v.getModel() + " " + v.getYearOfConstruction());
        }
    }
}
