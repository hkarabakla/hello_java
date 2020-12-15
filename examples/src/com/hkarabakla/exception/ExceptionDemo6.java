package com.hkarabakla.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo6 {

    public static void main(String[] args) {
        FileInputStream input = null;
        try {
            ClassLoader classLoader = ExceptionDemo6.class.getClassLoader();
            input = new FileInputStream(classLoader.getResource("file.txt").getFile());

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        } catch (IOException e) {
            System.out.println("Exception occurred while reading file");
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("Exception occurred while closing file");
                }
            }
        }
    }
}
