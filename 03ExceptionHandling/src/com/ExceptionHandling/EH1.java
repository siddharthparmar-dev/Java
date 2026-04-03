package com.ExceptionHandling;

import java.util.Scanner;

class Planet{
    public void earth(){
        earth();
    }
}
public class EH1 {
    public static void main(String[] args) {
        // compile time error ==> those error which compiler detect before runnig of the program
        // wrong syntax of code
        // semicolon missing
        // variable declartion
        // type mismatch


        // runtime error ==> after the compilation is done
        // those error which occurs at the time of running
//        Planet planet = new Planet();
//        planet.earth();
        // we are calling same method inside a method.....so inside stack area
        // multiple stack frames will be created till the capacity of ram


        // Exception : something which occurs at run time because of which abrupt termination of application will happen
        Scanner scan = new Scanner(System.in);
        System.out.println("kindly enter numerator to divide");
        int numerator = scan.nextInt();
        System.out.println("kindly enter denominator to divide");
        int denominator = scan.nextInt();
        // we will pul the risky part of code inside try block
        try {
        int result = numerator / denominator;
        System.out.println("Result is : " + result);
        System.out.println("Calc app terminated");
        }
        catch (ArithmeticException e){
            System.out.println("Enter non-zero denominator");
        }
        // if we enter 0 in denominator then mathematically it is wrong and jvm will throw an error

    }
}
