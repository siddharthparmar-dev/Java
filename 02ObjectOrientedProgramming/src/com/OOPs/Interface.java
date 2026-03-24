package com.OOPs;
interface Calculator
{
    void sub();
}
interface Calc
{
    float pi = 3.14f;  //public final static
    //Interface me jo bhi variable declare karte ho, wo automatically public,static,final hota hai
    void add(int a,int b);
    int mul(int a, int b);
    // by default all the methods inside interface class are public and abstract.
    // abstract means cannot be implement directly , it will be implement by other class.
}
class MyCalc implements Calc,Calculator
{
    public void add(int a,int b)
    {
        int c = a + b;
        System.out.println(c);
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public void sub(){

    }
}
// one interface can have multiple implementing classes
class MyCalc2 implements Calc
{
    public void add(int a,int b)
    {
        int c = a+b+100;
        System.out.println(c);
    }
    public int mul(int a,int b)
    {
        return a*b*100;
    }
}
public class Interface {
    public static void main(String[] args) {
        Calc c1 = new MyCalc();
        // interface ka object nhi bana skte hai but reference le sakte hai
        c1.add(7,9);
        System.out.println(c1.mul(5,9));
        Calc c2 = new MyCalc2();
        c2.add(7,9);
        System.out.println(c2.mul(5,9));
    }
}
/*
Interface is a way of specifying the requirements that needs to implemented.
--> Interface is a way of specifying the requirement that needs to be implemented
--> we use interface keyword to create interface in Java
--> All the methods in Java Interface are by default public and abstract whether you have specified or not
--> Multiple classes can implement one interface
--> We cannot create Object/instance of interface
--> We can create ref of interface to achieve polymorphism
--> interface helps to achieve standardization
--> One interface can extends another interface
--> One interface cannot implement another interface
--> One class can implement multiple interfaces at a time
Interface me jo bhi variable declare karte ho, wo automatically hota hai:
public static final
🔥 Important Points
✅ public → sab access kar sakte hain
✅ static → object banane ki zarurat nahi
✅ final → value change nahi ho sakti

 */