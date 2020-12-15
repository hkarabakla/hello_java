package com.hkarabakla.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo7 {

    public static void main(String[] args) throws IOException {
        FileInputStream input = null;
        try {
            ClassLoader classLoader = ExceptionDemo7.class.getClassLoader();
            input = new FileInputStream(classLoader.getResource("file.txt").getFile());

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
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
