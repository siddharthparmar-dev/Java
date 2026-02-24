package com.ExceptionHandling;
class printIt
{
    public void course(){
        course();
    }
}
public class EH1 {
    public static void main(String[] args) {
        printIt prt = new printIt();
        // Compile time
        // Run time
        // Exception
        prt.course();
    }
}

