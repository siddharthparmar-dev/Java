package com.ExceptionHandling;

import java.util.Scanner;

class Demo {

    public void divide() {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Kindly! Enter numerator to divide");
//        int num = sc.nextInt();
//
//        System.out.println("Kindly! Enter denominator");
//        int den = sc.nextInt();
//
//        int result = num / den;   // ArithmeticException yaha generate ho sakta hai
//        System.out.println("Result: " + result);
        alpha2 a = new alpha2();   // 👈 dusri file wali class ka object
        a.div();
    }
}

class Demo2 {

    public void disp() {

        try {
            Demo d = new Demo();
            d.divide();   // yaha se exception propagate hoga
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled in Demo2 disp()");
        }
    }
}

public class EH4 {

    public static void main(String[] args) {

        System.out.println("Calc app started");

        Demo2 d2 = new Demo2();
        d2.disp();

        System.out.println("Calc app terminated");
    }
}