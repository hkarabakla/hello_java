package com.hkarabakla.annotations;

@MyAnnotation
public class MyAnnotatedClass {

    private int value;

    @MyAnnotation(name = "valueForName", value = 1)
    public void annotatedMethod() {

        System.out.println("This method is annotated");
    }

    @MyAnnotationWithDefault
    @MyAnnotation
    public void annotatedMethodWithDefaultValues() {

        System.out.println("This method is annotated with default values");
    }
}
