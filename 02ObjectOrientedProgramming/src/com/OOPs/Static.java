package com.OOPs;
class Demo{
    static int a,b;
    int x,y;
    static {
        System.out.println("Static init block");
    }
    {
        System.out.println("java non-static init block ");
    }
    Demo(){
        System.out.println("constructor");
    }
    static void disp(){
        System.out.println("disp static method");
    }
    void show(){
        System.out.println("non static show");
    }
}
class alpha2 extends Demo{
    static void disp(){
        System.out.println("disp");
    }
}
public class Static {
    static
    {
        System.out.println("Static block before main method");
    }
    public static void main(String[] args) {

        System.out.println("main method");
        Demo d = new alpha2();
        d.disp();
    }
    /*
    Static block before main method
    main method

    because standard loads → Static block runs → main() runs

    class is first loaded in jvm so static block ran first and then main method
     */
}
