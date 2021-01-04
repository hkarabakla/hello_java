package com.hkarabakla.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo3 {

    public static void main(String[] args) {

        List<String> al = new ArrayList<>();
        al.add("BMW");
        al.add("Mercedes");
        al.add("Audi");
        al.add("Wolksvagen");
        al.add("Skoda");

        Collections.sort(al, Collections.reverseOrder());

        System.out.println("List after the use of" +
                " Collection.sort() :\n" + al);
    }
}
