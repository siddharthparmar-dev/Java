package com.Enums_Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD, ElementType.METHOD,ElementType.PARAMETER,ElementType.ANNOTATION_TYPE})
@interface Cars{
    String Name();
    int model() default 0;
}
@Cars(Name = "BMW", model = 10)
class BMW{
    
}
public class CustomAnnotation2 {
    public static void main(String[] args) {

    }
}
