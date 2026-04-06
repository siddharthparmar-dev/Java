package com.ExceptionHandling;
class Add{
    int add(int a,int b){
        try {
        System.out.println("Adding two numbers");
        return a+b;   //anything below return will never be executed
        }
        finally {    // so we use finally block...
            System.out.println("Add done");
            
        }
    }
}
public class EH7 {
    public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.add(5,8));
    }
}
