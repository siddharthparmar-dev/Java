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

    }
}
