package com.Fundamentals;

public class Operators {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;


        //arithematic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b%c);
        System.out.println(c/a);

        //relational operator (boolean result: true or false)
        // == . < , > , <= , >= , !=
        System.out.println(5 == 6);  // false
        System.out.println(5 < 6);   // true
        System.out.println(5 > 6);   // false
        System.out.println(5 <= 6);  // true
        System.out.println(5 >= 6);  // false
        System.out.println(5 != 6);  // true

        //logical operator
        // || , && , !
    }
}
