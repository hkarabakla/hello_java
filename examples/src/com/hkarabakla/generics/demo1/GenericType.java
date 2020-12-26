package com.hkarabakla.generics.demo1;

public class GenericType<T> {

    private T obj;

    public GenericType(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type of the class is " + this.obj.getClass().getName());
    }
}
