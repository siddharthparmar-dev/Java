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
public class privateKeyword {
    public static void main(String[] args) {
        Employee E = new Employee();
        E.setAge(23);
        E.setName("Siddharth");
        System.out.println(E.getAge());
        System.out.println(E.getName());
    }
}
