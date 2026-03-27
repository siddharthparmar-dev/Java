package com.OOPs;
class Employee{
    private int age;
    private String name;

    void setAge(int x){
        age = x;
    }

    int getAge(){
        return age;
    }

    void setName(String n){
        name = n;
    }

    String getName(){
        return name;
    }
}
/*
Encapsulation is wrapping data and methods into a single unit and restricting direct access using access modifiers.
 */
public class Encapsulation {
    public static void main(String[] args) {
        Employee E = new Employee();
        E.setAge(23);
        E.setName("Siddharth");
        System.out.println(E.getAge());
        System.out.println(E.getName());
    }
}
