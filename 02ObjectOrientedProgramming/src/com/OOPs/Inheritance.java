/*
🧬 Inheritance

Inheritance is a mechanism where one class acquires the properties and behaviors of another class.
It helps in code reuse and establishes an "IS-A" relationship.
 */
package com.OOPs;
class Alpha{    //extends object      //Aplha ===> Grand parent class
    int age = 15;
    void show(){
        System.out.println("Show method inside Alpha class");
    }
}
class Beta extends Alpha{     //Beta ==> parent class
    void disp(){
//        age = 15;
        System.out.println(age);
        System.out.println("disp method inside beta class");
    }
}
class Gamma extends Beta{    //Gamma ==> child class
    void print(){
//        age = 17;
//        System.out.println(age);
        System.out.println("print method of gamma class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Gamma g = new Gamma();
        g.show();
        g.disp();
        g.print();
        int Age = g.age;
        System.out.println(Age);

    }
}
// 👉 Java multiple inheritance allow hi nahi karta (classes ke case me)
//👉 Isliye:
//💡 Diamond problem Java me automatically avoid ho jata hai