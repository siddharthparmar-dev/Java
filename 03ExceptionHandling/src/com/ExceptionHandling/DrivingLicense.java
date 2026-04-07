package com.ExceptionHandling;

import java.util.Scanner;
class underAge extends Exception{
    underAge(String warning){
        super(warning);
    }
}
class overAge extends Exception{
    overAge(String warning){
        super(warning);
    }
}
class Applicant{
    private String Name;
    private int age;
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        Name = scanner.next();
        System.out.println("Enter your age");
        age = scanner.nextInt();
    }
    public void verify() throws underAge,overAge{
        if (age >= 18 && age <= 70){
            System.out.println(Name + " you are eligible for license");
        }
        else if (age < 18){
            throw new underAge(Name + " you are under age and not eligible for license");
        }
        else {
           throw new overAge(Name + " you are over age and not eligible for license");
        }
    }
}
class RTO{
    public void startApp(){
        Applicant applicant = new Applicant();
        System.out.println("RTO application started");
       try {
          applicant.input();
          applicant.verify();
       }
       catch (underAge | overAge exception){  //| in catch = "multiple exceptions ek saath handle karna
           System.out.println(exception.getMessage());
           try {
               applicant.input();
               applicant.verify();
           }
           catch (underAge | overAge exception1){
               System.out.println(exception1.getMessage());
               try {
                   applicant.input();
                   applicant.verify();
               }
               catch (underAge | overAge exception2){
                   System.out.println(exception2.getMessage());
//                   System.out.println("Session timed out");
               }
           }
       }
    }
}
public class DrivingLicense {
    public static void main(String[] args) {
        RTO rto = new RTO();
        rto.startApp();
    }
}
