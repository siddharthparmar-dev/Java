package com.ExceptionHandling;

import java.util.Scanner;

class alpha{
    public void div(){
        System.out.println("Alpha app started");
        Scanner input = new Scanner(System.in);
        try {

            System.out.println("Kindly! Enter numerator to divide");
            int num = input.nextInt();

            System.out.println("Kindly! Enter denominator");
            int den = input.nextInt();

            int result = num / den;   // ArithmeticException yaha generate ho sakta hai
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("handled in divide of demo");
            throw e;
        }
        System.out.println("alpha app terminated");
    }
}

public class EH5 {
    public static void main(String[] args) {


    }
}
