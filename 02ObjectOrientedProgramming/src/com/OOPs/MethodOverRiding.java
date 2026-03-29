package com.OOPs;
class Parent{
    void alpha(){
        System.out.println("alpha method of parent class");
    }
    void beta(){
        System.out.println("beta method of parent class");
    }
    void omega(){
        System.out.println("omega method of parent class");
    }
}
class Child extends Parent{
    //overridden method
    void alpha(){
        System.out.println("alpha method of child class");
    }
    void gamma(){
        System.out.println("gamma method of parent class");
    }

}
public class MethodOverRiding {
    public static void main(String[] args) {
        Parent child = new Child();
        child.alpha();    //alpha method of child class
        child.beta();     //beta method of parent class
//       child.gamma();  //error
//      In Java ====>
//      Reference type decides what methods are accessible (compile time)
//      Object type decides which method runs (runtime)
        child.omega();  //omega method of parent class

        /*
            🧩 Kyun?

            👉 Step-by-step samajh:

            ✔ Compile time:
            Reference type = Parent
            Compiler check karega: kya omega() Parent me hai?
            ✔ YES → allowed
            ✔ Runtime:
            Object = Child
            Java check karega: kya Child ne override kiya?
            ❌ NO

            👉 Toh:
            Parent ka method hi chalega
         */

    }
}
