package com.hkarabakla.solid.ocp;

public class Main {

    public static void main(String[] args) {


        Person employee = new Employee();
        Person student = new Student();

        Product p1 = new Product(10);

        System.out.println(employee.getDiscounter().getPrice(p1));
        System.out.println(student.getDiscounter().getPrice(p1));
    }
}
