package com.Enums_Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //Tells java: How annotation Behaves
@Target(ElementType.TYPE)          //Where it can be used
@interface CricketPlayer{
    String Country();

    int innings() default 0;   //innings automatically = 0
}
@CricketPlayer(Country = "South Africa") //metadata attached to class Frameworks/tools can later read it.
class ABD{
    private int innings;

    public ABD(){

    }

    public void setInnings(int innings){
        this.innings = innings;
    }

    public int getInnings(){
        return innings;
    }
}
public class CustomAnnotation {
    public static void main(String[] args) {
        ABD abd = new ABD();
        Class<? extends ABD> cls = abd.getClass();
        System.out.println(cls.getSimpleName());
        /*
            What is this?
            Class<? extends ABD> cls = abd.getClass();
            This gets the Class object of ABD.

            Think of Class object as:
            "complete runtime information about a class"

            Using it, Java can inspect:
            methods
            fields
            constructors
            annotations
            This is called Reflection API.

            So now:
            cls
            represents metadata of class ABD.
         */
        CricketPlayer ann =  cls.getAnnotation(CricketPlayer.class);
        System.out.println(ann);
        String c = ann.Country();
        int i = ann.innings();
        System.out.println(c + i);
    }
}
