package com.Enum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// creating annotation using interface
// add @ before to tell jvm that i am creating an annotation
// Annotation in Java
// Annotation ek special type ka interface hota hai jo @interface keyword se declare hota hai.
// Ye program ke baare me extra information (metadata) dene ke liye use hota hai.

// Example
// @interface CricketPlayer { }

// @Retention(RetentionPolicy.RUNTIME)
// Ye batata hai annotation kitni der tak available rahega.
// SOURCE  -> sirf source code tak
// CLASS   -> .class file tak store hota hai
// RUNTIME -> program run hone ke time bhi available hota hai (reflection se read kar sakte hain)

// @Target(...)
// Ye batata hai annotation kaha use ho sakta hai.

// ElementType.TYPE        -> class ya interface ke upar
// ElementType.CONSTRUCTOR -> constructor ke upar
// ElementType.PARAMETER   -> method parameter ke upar

// Example usage
// @CricketPlayer
// class Virat {
//     @CricketPlayer
//     Virat(){}
//
//     void play(@CricketPlayer int runs){ }
// }

// Short definition:
// Annotation Java me metadata provide karta hai jo compiler ya runtime tools read kar sakte hain.
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.PARAMETER,ElementType.METHOD})
@interface CricketPlayer{

}
@CricketPlayer
class RohitSharma{
    public int getInnings() {
        return innings;
    }

    @CricketPlayer
    public void setInnings(int innings) {
        this.innings = innings;
    }

    private int innings;

    public RohitSharma(){

    }

}
public class Annotations {

}
