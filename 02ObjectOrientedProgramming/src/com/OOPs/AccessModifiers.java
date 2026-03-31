package com.OOPs;
class ProgrammingLang{

}
class Java extends ProgrammingLang{
    Java(){
        System.out.println("java application");
    }
}
class Animal{
     void eat(){
        System.out.println("Animal is eating");
    }

     int age(){
        return 10;
    }

    public ProgrammingLang lang(){
         ProgrammingLang language = new ProgrammingLang();
         return language;
    }
}
class Tiger extends Animal{
      public void eat(){          // child ka access modifier parent se bada ho skta h  but chota nhi
        System.out.println("Tiger is eating");
    }

      public int age(){
        return 10;
    }

    public Java lang(){
        Java language = new Java();
        return language;
    }
}

public class AccessModifiers{
    public static void main(String[] args) {
        Animal a = new Tiger();
        a.lang();
    }
}

/*
====> Child class method parent se kam visible nahi ho sakta
Visibility increasing >>>>>>>>>>>> Visibility decreasing
public > protected > default > private


Types of access modiifers
=====> 1. public      eg : public int x;
 🔓 Access:
Same class
same package
Diffrent package
inheritance
👉 Use case: Jab sabko access dena ho

====> 2. protected    eg: protected int x;
 🔓 Access:
Same class
Same package
Diffrent package (direct)  ❌
Diffrent package + inheritance
👉 Use case: Jab sirf child classes ko access dena ho

 ====> default (No modifiers)
 🔓 Access:
Same class ✔
Same package ✔
Different package ❌
Inheritance (diff package) ❌
👉 Use case: Package-level restriction

====> private (Most restricted)
🔓 Access:
Same class ✔
Same package ❌
Different package ❌
Inheritance ❌
👉 Use case: Encapsulation (data hiding)
 */