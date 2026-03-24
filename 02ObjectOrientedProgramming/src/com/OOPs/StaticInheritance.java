package com.OOPs;

class Animal1
{
    static void disp(){
        System.out.println("parent class static method");
    }
}

class Deer extends Animal1
{
    static void disp(){
        System.out.println("Deer class static method");
    }
}

public class StaticInheritance {
    public static void main(String[] args) {
        Animal1 show = new Deer();
        show.disp();

        /*
        output: parent class static method
        Because of static keyword method overriding
        static method override nahi hote wo hide hote hai
        Yaha dono classes me static disp() method hai.
        Ab yaha dhyaan do 👇
        Object bana hai 👉 new Deer()
        Reference type hai 👉 Animal1

        🔥 Important Concept
          ✅ Static methods override nahi hote

           Static methods override nahi hote, wo hide hote hain.

            Isko bolte hain 👉 Method Hiding

            🔹 Static Method Ka Rule

        Static method ka decision compile time par hota hai,
        aur wo reference type par depend karta hai
        na ki object par.


        agar ye method non static hota toh ye method override ho jata

       important:
       Animal1 show = new Deer();
       static method reference type dekhta h
       non static method object type dekhta h
         */
    }
}
