package com.ExceptionHandling;

import java.util.Scanner;

class Alpha {
    Scanner scan = new Scanner(System.in);
    public void divide() {
        try {
            System.out.println("Calculator app started");
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
        finally {
        System.out.println("Alpha  app terminated");  // this line not got printed
        scan.close();
        /*
            Agar tum System.in wale Scanner ko close kar dete ho:
            Phir dobara input lena possible nahi hota
            Kyuki System.in bhi close ho jata hai
         */
        }
    }
}
public class EH6 {
    public static void main(String[] args) {
        try {
        Alpha alpha = new Alpha();
        alpha.divide();
        }
        catch (ArithmeticException e) {
            System.out.println("Handled in main");  //after exception is thrown
            // ....control will come back to main method and here catch block will handle that exception
        }
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
