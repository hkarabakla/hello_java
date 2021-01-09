package com.hkarabakla.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyAnnotationDemo {

    public static void main(String[] args) {

        MyAnnotatedClass ob = new MyAnnotatedClass();

        Class<? extends MyAnnotatedClass> obClass = ob.getClass();
        Method[] methods = obClass.getMethods();

        for (Method m : methods) {
            for (Annotation a: m.getAnnotations()) {
                if (a instanceof MyAnnotation) {
                    MyAnnotation myAnnotation = (MyAnnotation) a;
                    System.out.println(myAnnotation.name());
                }
                System.out.println(a);
            }
        }
    }
}
