package com.OOPs;
interface Calculate{     //all the methods inside java interface is public and abstract
    void add(int a,int b);
    int multiply(int a,int b);
}
interface Print{
    int divide(int a,int b);
}
class MyCalc implements Calculate,Print{   // one class can implement multiple interfaces
    public void add(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
}
class MyCalc2 implements Calculate{
    public void add(int a,int b){
        int sum = a + b + 100;
        System.out.println(sum);
    }
    public int multiply(int a,int b){
        return a*b*10;
    }
}
public class Interface{
    public static void main(String[] args) {
        Calculate cal = new MyCalc2();
        cal.add(45,65);
    }
}
