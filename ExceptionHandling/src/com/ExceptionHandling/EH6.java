package com.ExceptionHandling;

import java.util.Scanner;

class alpha2{
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
        catch (ArithmeticException e){       // if catch block not matches the exception and finalyy will be executed
            System.out.println("handled in divide of demo");   // if exception is occured in catch then abnormal termination
        }finally {
            System.out.println("alpha2 terminated");  // finally block will run always except when exception is occured in catch
        }
        System.out.println("alpha app terminated");
    }
}
public class EH6 {
    public static void main(String[] args) {
        alpha2 a = new alpha2();
        a.div();
    }
}
