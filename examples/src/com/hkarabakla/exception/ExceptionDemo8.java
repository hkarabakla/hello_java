package com.hkarabakla.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo8 {

    public static void main(String[] args) {
        ClassLoader classLoader = ExceptionDemo8.class.getClassLoader();

        try (FileInputStream input = new FileInputStream(classLoader.getResource("file.txt").getFile())) {

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        } catch (IOException e) {
            System.out.println("Exception occurred while reading file");
            e.printStackTrace();
        }
    }
}
