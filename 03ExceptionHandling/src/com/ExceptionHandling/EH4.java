package com.ExceptionHandling;

import java.util.Scanner;
class Demo{
    public void divide(){
        System.out.println("Calculator app started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Numerator");
        int num = scan.nextInt();
        System.out.println("Enter Denominator");
        int deno = scan.nextInt();
        int result = num / deno;
        System.out.println("Result is : " + result);
        System.out.println("Calculator app terminated");
    }
}
class Demo2{
    public void disp(){
        try {
            Demo demo = new Demo();
            demo.divide();
        }
        catch (ArithmeticException e){
            System.out.println("Exception handled in Demo2");
        }
    }
}
public class EH4 {
    public static void main(String[] args) {
      Demo2 demo = new Demo2();
      demo.disp();
    }
}
