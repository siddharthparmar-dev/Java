package com.OOPs;

import java.util.Scanner;

class Farmer{
    private float principalAmount;
    private float simpleIntrest;
    private float tenure;
    private static float rateOfIntrest;  //commom copy of data for all the objects

    static
    {
        rateOfIntrest = 4.5f;
    }

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly enter the loan amount");
        principalAmount = scan.nextFloat();
        System.out.println("Kindly enter the tenure");
        tenure = scan.nextFloat();
    }

    void compute(){
        simpleIntrest = (principalAmount * tenure * rateOfIntrest) / 100.0f;
    }

    void disp(){
        System.out.println("Simple intrest is " + simpleIntrest);
    }
}
public class LoanApplication {
    public static void main(String[] args) {
        System.out.println("Farmer Loan Application");
        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();
        Farmer farmer3 = new Farmer();

        System.out.println("farmer 1 kindly fill the form");
        farmer1.input();
        farmer1.compute();
        farmer1.disp();

        System.out.println("farmer 2 kindly fill the form");
        farmer2.input();
        farmer2.compute();
        farmer2.disp();

        System.out.println("farmer 3 kindly fill the form");
        farmer3.input();
        farmer3.compute();
        farmer3.disp();
    }
}
