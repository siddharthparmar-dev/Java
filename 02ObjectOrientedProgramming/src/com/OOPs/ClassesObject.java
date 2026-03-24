package com.OOPs;

class Student{
    int id;
    String name;
    double age;

    void sleep(){
        System.out.println("sleep");
    }

    void study(){

    }
}
public class ClassesObject {
    public static void main(String[] args) {
         Student stu = new Student();
         stu.sleep();
    }
}


