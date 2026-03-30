package com.OOPs;
class Demo1{
    private int x = 10;
    Demo1(){
        System.out.println("Demo 1");
    }
}
//👉 Agar tum constructor me super() nahi likhte, to Java khud automatically first line me super() add kar deta hai
class Demo2 extends Demo1{
    Demo2(){
        super(); // the main job of super is  to call zero-parameterized parent class constructor.
        System.out.println("Demo 2");  //Java automatically first line me super() insert karta hai (default constructor case me)
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        //Demo 1
        //Demo 2
        //👉 Constructor execution always goes: Parent → Child (due to super())
    }
}
