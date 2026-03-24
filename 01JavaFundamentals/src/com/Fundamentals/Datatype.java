package com.Fundamentals;

public class Datatype {
    public static void main(String[] args) {
        /*
        Primitive data type:
        int    4 byte
        float  4 byte
        short  2 byte
        char   2 byte
        double 8 byte
        long   8 byte
        byte   1 byte

        ======================================

        1 byte ==> 8 bits
        1 bit ==> 2 transistor
        ao, 1 byte ==> 16 transistors


        formula for finding range :
        ==========================

        -2^n-1 to (2^n-1)- 1
        n = bits
        for byte:
        -2^8-1 to (2^8-1) - 1 = -128 to 127


        ============================================================

        .java file ====> java compiler (javac) ====> byte code (.class file) ====> JVM ====> CPU

        =============================================================

        ASCII code: (American standard code for information interchange
        ASCII is a 7-bit character encoding system with values from 0 to 127.
        it contains A-Z a-z 0-9 and special characters
        🔹 Quick Memory Tricks 🧠
        '0' = 48
        'A' = 65
        'a' = 97
        Difference between:
        'A' and 'a' = 32

         Java follows Unicode character set.
         Java internally uses UTF-16 for character representation.
         char data type = 16 bits (2 bytes).
         Each char stores a Unicode code unit.
         Emoji and some special characters require 2 char values (surrogate pair).
         For files/web, UTF-8 is commonly used.

        ================================================================

        post increment
        Use value first → then increase
        int a = 5;
        int b = a++;
        System.out.println(a); // 6
        System.out.println(b); // 5

        // post increment ka mtlb ki value use hone ke baad badhegi
        // agar abhi a ki value 5 hai toh b = a++ m a ki value 5 use hogi aur fir plus hogi for next

        pre increment
        Increase first → then use value
        int a = 5;
        int b = ++a;
        System.out.println(a); // 6
        System.out.println(b); // 6

        =================================================
        when used alone (ye common trap h )
        int a = 5;
        a++;
        // or
        ++a;

        output: 6

        output m koi diffrence nhi h kyuki yaha akele use hora h koi expression nhi h

        example:
        int a = 5;
        System.out.println(a++ + ++a);

        Output = 12
        a = 7

        **** a++ returns old value then increments, ++a increments first then returns new value. ****



         */
    }
}
