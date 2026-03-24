package com.ExceptionHandling;

import java.util.Scanner;

public class EH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calc app started");
        try {
            System.out.println("Kindly ! Enter numerator to divide");
            int n = sc.nextInt();
            System.out.println("Kindly ! Enter denominator to divide");
            int d = sc.nextInt();
            int result = n/d;
            System.out.println("result is " + result);
        }
        catch (Exception e){     // exception happens in run time // exception is not handled by compiler
            //ArithmeticException ek Runtime Exception hai.
            System.out.println("Enter non zero denominator");
        }
        try {
            System.out.println("Enter size of an array");
            int size = sc.nextInt();

            int arr[] = new int[size];   // May cause NegativeArraySizeException

            System.out.println("Enter data to be inserted in an array");
            int data = sc.nextInt();

            System.out.println("Enter the position at which data has to be inserted");
            int index = sc.nextInt();

            arr[index] = data;   // May cause ArrayIndexOutOfBoundsException

            System.out.println("Data inserted successfully");
        }catch (NegativeArraySizeException e) {    // negative array size exception
            System.out.println("Stay positive");
        }
        catch (ArrayIndexOutOfBoundsException e) {  // array index out of bound exception
            System.out.println("Be within your limits! Don't cross boundaries");
        }
        catch (Exception e) {       // generic exception will always be at the end otherwise it will give error
            System.out.println("Something went wrong");
        }
    }
}
