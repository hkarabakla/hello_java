package com.hkarabakla.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationWithDefault {
    String name() default "defaultValueForName";
    int value() default 0;
}
