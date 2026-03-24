package com.ExceptionHandling;

import java.util.Scanner;

public class EH2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calc app started");
        try {
            System.out.println("Kindly ! Enter numerator to divide");
            int n = input.nextInt();
            System.out.println("Kindly ! Enter denominator to divide");
            int d = input.nextInt();
            int result = n/d;
            System.out.println("result is " + result);
        }
        catch (Exception e){     // exception happens in run time // exception is not handled by compiler
            //ArithmeticException ek Runtime Exception hai.
            System.out.println("Enter non zero denominator");
        }
    }
}
