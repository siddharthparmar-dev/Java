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
    private  String name;
    public BMW() {
        System.out.println("BMW Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class CustomAnnotation2 {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Class cls = bmw.getClass();
        System.out.println(cls.getSimpleName()); //BMW
        Cars Antn = (Cars) cls.getAnnotation(Cars.class);
        System.out.println(Antn);
    }
}