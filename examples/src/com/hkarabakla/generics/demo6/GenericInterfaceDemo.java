package com.hkarabakla.generics.demo6;

public class GenericInterfaceDemo<T> implements ContainChecker<T> {

    T[] values;

    public GenericInterfaceDemo(T[] values) {
        this.values = values;
    }

    public boolean contains(T obj) {
        for (T value : values) {
            if (value.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
