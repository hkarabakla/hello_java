package com.hkarabakla.inheritance;

public class GenericMethodDemo {

    public <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] arr1, V[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }
}
