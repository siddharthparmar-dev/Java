package com.ExceptionHandling;

import java.util.Scanner;

class Alpha {
    public void divide() {
        try {
            System.out.println("Calculator app started");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Numerator");
            int num = scan.nextInt();
            System.out.println("Enter Denominator");
            int deno = scan.nextInt();
            int result = num / deno;
            System.out.println("Result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in Demo3");
           // throw new ArithmeticException();
            throw e;  //throw ke baad method ka execution ruk jata hai
        }
        System.out.println("Alpha  app terminated");  // this line not got printed
    }
}
public class EH6 {
    public static void main(String[] args) {
        try {
        Alpha alpha = new Alpha();
        alpha.divide();
        }
        catch (ArithmeticException e){
            System.out.println("Handled in main");

/*
        🔁 Actual flow kya hua
        divide() method call hua
        deno = 0 → exception aayi
        catch block chala →
        ✔ print: "Exception handled in Demo3"
        throw e; execute hua →
        ❌ method wahi khatam
        ❌ neeche wali line skip
 */
        }
    }
}
