package com.ExceptionHandling;

import java.util.Scanner;

class Demo3{
    public void divide(){
        try {
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
        catch (ArithmeticException e){
            System.out.println("Exception handled in Demo3");
        }
    }
}
class Demo4{
    public void disp(){
        try {
            Demo3 demo = new Demo3();
            demo.divide();
        }
        catch (ArithmeticException e){
            System.out.println("Exception handled in Demo4");
        }
    }
}
public class EH5 {
    public static void main(String[] args) {
        System.out.println("Calculator app started");
        try{
        Demo4 demo4 = new Demo4();
        demo4.disp();
        }
        catch (ArithmeticException e){
            System.out.println("Exception handled in main");
        }
    /*
    Demo3 has an exception handler already so JVM will check whether Demo3 has an exception handler, if not then it will
    move to Demo4 and check whether Demo4 has an exception handler or not, if Demo4 has , then it will handle it otherwise
    it will go to main method and check whether main method has exception handler

    so basically the priority is method own handler and if there is no handler then JVM will check those methods who are
    calling it and if they also dont have then default exception handler will run.
     */
    }
}
